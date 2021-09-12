import java.util.*;

public class StringAnalyzer
{
    public static boolean hasMoreVowelsThanConsonants(String word)
    {
        int vowels = 0;
        
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
                vowels++;
        }
        
        if(vowels>(word.length()-vowels))
            return true;
            
        return false;
    }
    
    public static void stringRemoverMachine(List<String> words)
    {
        for(int i=0;i<words.size();i++)
        {
            if(!hasMoreVowelsThanConsonants(words.get(i)))
            {
                words.remove(i);
                i--;
            }
        }
        
        System.out.println(words);
    }
}
