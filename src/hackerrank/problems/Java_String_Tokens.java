
package hackerrank.problems;
import java.util.Scanner;
/**
 *
 * @author Banna
 */
public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        s = s.trim();// use for space delete
        
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        String[] tokens = s.split("[^a-zA-Z]+");

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
