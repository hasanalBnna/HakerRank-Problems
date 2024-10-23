
package hackerrank.problems;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author Banna
 */
public class Pattern_Syntax_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        
        // while(testCases>0){
        // 	String pattern = in.nextLine();
       
        for (int i = 0; i < testCases; i++) {
            String pattern = scanner.nextLine();
            
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        
        scanner.close();
    }
}
