
package hackerrank.problems;

import java.util.Scanner;

/**
 *
 * @author Banna
 */
public class Java_Substring_Comparisons {

public static String getSmallestAndLargest(String s, int k) {
        // Step 1: Initialize smallest and largest substrings
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Step 2: Loop through the string to find all substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            
            // Step 3: Compare each substring to the current smallest and largest
            if (substring.compareTo(smallest) < 0) {
                smallest = substring; // Update if we find a smaller substring
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring; // Update if we find a larger substring
            }
        }
        
        // Step 4: Return the result as smallest and largest substrings
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 5: Read the input string and the value of k
        String s = sc.next();
        int k = sc.nextInt();
        
        // Step 6: Get the smallest and largest substrings and print them
        System.out.println(getSmallestAndLargest(s, k));
        
        sc.close();
    }
    
    
}
