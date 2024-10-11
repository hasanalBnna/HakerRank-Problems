
package hackerrank.problems;
import java.util.Scanner;
/**
 *
 * @author Banna
 */
public class Java_Int_to_String {

   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        try {
            String s = Integer.toString(n);
            //String s = String.valueOf(n);
           
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}

    

