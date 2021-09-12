
/**
 * A -> I = E
 * E -> P O P | P
 * O -> + | - | * | / | **
 * P -> I | L | UI | UL | (E)
 * U -> + | - | !
 * I -> C | CI
 * C -> a | b | ... | y | z
 * L -> D | DL
 * D -> 0 | 1 | ... | 8 | 9
 *
 * Author: Edel Barcenas
 * Course: CS280 Summer
 * Professor: Jonathan Kaplaeu
 */
public class Main
{
    private static String s;
    private static int i;
    
    public static void main(String[] args) {

        s = args.length == 1 ? args[0] : "";

        if (A() && i == s.length()) {
            System.out.println("The string \"" + s + "\" is in the language.");
        }
        else {
            System.out.println("The string \"" + s + "\" is not in the language.");
        }
    }
    
    public static boolean A(){
        if(I()){
            if(i<s.length() && s.charAt(i) == '='){
                if(E()){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean E(){
        if(P()){
            if(O()){
                return P();
            }
            return true;
        }
        return false;
    }
    
    public static boolean O(){
        if(i < s.length()){
            if(s.charAt(i) == '+'|| s.charAt(i) == '-' || s.charAt(i) =='/'){
                i++;
                return true;
            }
            if(s.charAt(i) == '*'){
                i++;
                if(i < s.length() && s.charAt(i) == '*'){
                    i++;
                }
                return true;
            }
        }
    
        return false;
    }

    public static boolean P(){
        if(I() || L()){
            return true;
        }
        if(U() && (I() || L())){
            return true;
        }
        if(i<s.length() && s.charAt(i) == '('){
            i++;
            if(E() && i<s.length() && s.charAt(i) == ')'){
                i++;
                return true;
            }
        }
        return false;
    }
    
    public static boolean U(){
        if(i < s.length() && (s.charAt(i) == '+'|| s.charAt(i) == '-' || s.charAt(i) =='!')){
            i++;
            return true;
        }
        return false;
    }
    
    public static boolean I(){
        if(C()){
            if(I()){
                return true;
            }
            return true;
        }
        return false;
    }
    
    public static boolean C(){
        if( i < s.length() && 'a' <= s.charAt(i) && s.charAt(i) <= 'z'){
            i++;
            return true;
        }
        return false;
    }
    
    public static boolean L(){
        if(D()){
            if(L()){
                return true;
            }
            return true;
        }
        return false;
    }
    
    public static boolean D(){
        if( i < s.length() && '0' <= s.charAt(i) && s.charAt(i) <= '9'){
            i++;
            return true;
        }
        return false;
    }
}

















