
package hackerrank.problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Banna
 */
public class Java_Anagrams {

    static boolean isAnagram(String a, String b){
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        
        if(c1.length != c2.length){
//            System.out.println("Not Anagrams");
                return false;
        }
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        for(int i = 0; i<c1.length; i++){
            if(c1[i] != c2[i]){
//              System.out.println("Not Anagrams");  
                return false;
            }
        }
//        System.out.println("Anagrams");
        return true;
//        a= a.toLowerCase();
//        b=b.toLowerCase();
//        
//        if(a.length() != b.length()){
//            return false;
//        }
            

    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String a = sc.next();
       String b =sc.next();
       sc.close();
      boolean bt= isAnagram(a, b);
      System.out.println((bt) ? "Anagrams": "Not Anagrams");
        
    }
    
}
