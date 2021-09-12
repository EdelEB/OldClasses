//
//  main.c
//  HW_7
//  Problem2_nonrecursive
//
//  Goal: without recursion, run through all subdirecties of directory argv[1]
//
//  Created by Edel Enrico Barcenas on 3/29/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <dirent.h>

typedef struct Node {//this Node is used for the LinkedList and the Stack, but Stack does not use size
    char path[100];
    int size;//ignored for stack nodes instead of creating a stackNode struct, maybe I'm lazy, maybe this code is long enough already
    struct Node* next;
}Node;

Node * top = NULL;       //allows for use of stack when finding all subdirectories  (used by push and pop)

Node * head = NULL;      //allows for use of LinkedList for all filenames and sizes
int llsize = 0;          //number of nodes in LinkedList

void printList(){
    Node * curr = head;
    while(curr->next != NULL){
        printf("%d\t%s\n", curr->size, curr->path);
        curr = curr->next;
    }
    printf("%d\t%s\n", curr->size, curr->path);
}

void swapNodeVals(Node * curr, Node * next){
    int tempSize = curr->size;
    char tempPath[100];
    strcpy(tempPath, curr->path);
    
    strcpy(curr->path, next->path);
    curr->size = next->size;
    
    strcpy(next->path, tempPath);
    next->size = tempSize;
}

void sortList(){
    Node * curr;
    for(int i = 0; i < llsize-1 ; i++){
        curr = head;
        while( curr->next != NULL){
            if(curr->size > curr->next->size){
                swapNodeVals(curr, curr->next);
            }
            curr = curr->next;
        }
    }
}

void addNode(char* path, int size){ //adds to new node the link list
    llsize++;
    Node * temp = (Node*)malloc(sizeof(Node));
    strcpy(temp->path, path);
    temp->size = size;
    temp->next = head;
    head = temp;
}

void push(const char* path){ //adds node to the stack
    Node * temp = (Node*)malloc(sizeof(Node));
    strcpy(temp->path, path);
    temp->next = top;
    top = temp;
}

char* pop(){ //removes node from stack and returns its path value
    Node * temp = top;
    top = top->next;
    return temp->path;
}

int getFileSize(char * path){
    FILE *myFile;
    myFile = fopen(path, "rb");
    if(myFile == NULL){
        printf("Error: File Argument Not Found\n");
        return 1;
    }
    
    fseek(myFile, 0, SEEK_END);                 //moves pointer to end of file to get size
    int size = ftell(myFile);                   //saves size
    fclose(myFile);
    
    return size;
}

void traverseDir(const char * dName){
    push(dName);                        //initializes stack top
    while(top != NULL){
        dName = pop();
        
        DIR* dir = opendir(dName);
        if(dir == NULL){
            printf("Error Opening Directory: %s\n", dName);
            return;
        }
        struct dirent* entity;
        entity = readdir(dir);
        
        while(entity != NULL) {
            char path[100] = { 0 };
            strcat(path, dName);
            strcat(path, "/");
            strcat(path, entity->d_name);
            
            if(entity->d_type != DT_DIR){
                addNode(path , getFileSize(path));
            }
            else if(strcmp(entity->d_name,".")!=0 && strcmp(entity->d_name,"..")!=0){
                push(path);             //pushes directory name onto stack instead of recursive call
            }
            entity = readdir(dir);
        }
        closedir(dir);
    }
}

int main(int argc, const char * argv[]) {
    traverseDir(argv[1]);
    sortList();
    printList();
    
}

