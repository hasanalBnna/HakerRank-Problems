
package hackerrank;
import java.util.Scanner;
/**
 *
 * @author Banna
 */
public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Step 1: Read the input string
        String s = scan.nextLine();
        scan.close();
        
        // Step 2: Trim the string to remove any leading/trailing spaces
        s = s.trim();
        
        // Step 3: Handle the case where the string is empty after trimming
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        // Step 4: Split the string by non-alphabetic characters using a regular expression
        String[] tokens = s.split("[^a-zA-Z]+");
        
        // Step 5: Print the number of tokens
        System.out.println(tokens.length);
        
        // Step 6: Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
