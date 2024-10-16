
package hackerrank.problems;

import java.util.Scanner;

/**
 *
 * @author Banna
 */
public class Java_Substring_Comparisons {

public static String getSmallestAndLargest(String s, int k) {
        
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            
            
            if (substring.compareTo(smallest) < 0) {
                smallest = substring; 
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring; 
            }
        }
        
        //the part below are given 
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String s = sc.next();
        int k = sc.nextInt();
        
        
        System.out.println(getSmallestAndLargest(s, k));
        
        sc.close();
    }
    
    
}
