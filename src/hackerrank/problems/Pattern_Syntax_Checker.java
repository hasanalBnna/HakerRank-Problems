
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
        
        // Step 1: Loop through each test case
        for (int i = 0; i < testCases; i++) {
            String pattern = scanner.nextLine();
            
            try {
                // Step 2: Try to compile the pattern
                Pattern.compile(pattern);
                // Step 3: If no exception is thrown, the pattern is valid
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                // Step 4: If an exception is thrown, the pattern is invalid
                System.out.println("Invalid");
            }
        }
        
        scanner.close();
    }
}
