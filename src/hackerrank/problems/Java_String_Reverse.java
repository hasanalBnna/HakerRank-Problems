
package hackerrank.problems;

import java.util.Scanner;

/**
 *
 * @author Banna
 */
public class Java_String_Reverse {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String reversed = new StringBuilder(A).reverse().toString();
        
        
        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
    
}
