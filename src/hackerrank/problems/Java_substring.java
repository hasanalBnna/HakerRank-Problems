/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hackerrank.problems;

import java.util.Scanner;

/**
 *
 * @author Banna
 */
public class Java_substring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S= sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        String output = S.substring(start, end);
        System.out.println(output);
        
        sc.close();
        
    }
    
}
