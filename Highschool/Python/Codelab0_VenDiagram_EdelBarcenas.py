#Edel Barcenas
#Prof: Summerfield
#CS100 105
#9/25/18
#Codelab0
    #Ven Diagram

def venn(left,right):
    center=[];
    for i in left:
        if(i in right):
            center.append(i);
            right.pop(right.index(i));
            left.pop(left.index(i));
    return (left,center,right);

print(venn([1,5,7],[2,3,5]));
