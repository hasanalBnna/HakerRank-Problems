
package hackerrank.problems;

import java.util.Scanner;

/**
 *
 * @author Banna
 */
public class Java_Regex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}

class MyRegex {
    // Regular expression pattern for a valid IP address
//    public String pattern = 
//        "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.)"  // First 3 octets
//        + "{3}"  // Repeat the pattern for 3 octets
//        + "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$";  // Last octet
    
//    public String pattern = 
//        "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)\\.)"  // First 3 octets
//        + "{3}"  // Repeat for 3 octets
//        + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?|0)$";
    
    public String pattern = 
        "^((0?[0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.)"  // First 3 octets
        + "{3}"  // Repeat for 3 octets
        + "(0?[0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
}

