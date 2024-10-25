
package hackerrank.problems;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Banna
 */
public class Java_Regex_2_Duplicate_Words {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Pattern to match consecutive duplicate words
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // Ignore case
        
        // Number of lines to process
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            // Create a Matcher object
            Matcher m = p.matcher(input);
            
            // Replace all consecutive duplicates
            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1));
            }
            
            // Print the result after replacement
            System.out.println(input);
        }
        
        in.close();
    }
}
