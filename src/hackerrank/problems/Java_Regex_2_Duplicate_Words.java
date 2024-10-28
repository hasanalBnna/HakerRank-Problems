
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
        
        
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); 
        
        
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            
            Matcher m = p.matcher(input);
            
            // Replace all consecutive duplicates
//            while (m.find()) {
//                input = input.replaceAll(m.group(0), m.group(1));
//            }
              while (m.find()) {
                input = m.replaceAll("$1"); 
                m = p.matcher(input); 
            }
            
            
            System.out.println(input);
        }
        
        in.close();
    }
}
