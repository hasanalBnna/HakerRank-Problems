/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank.problems;


import java.util.*;
import java.io.*;

/**
 *
 * @author Banna
 */
public class JavaLoopsII {
        public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        for(int i=0;i<t;i++){
           int a = in.nextInt();
           int b = in.nextInt();
           int n = in.nextInt();
            
            int c=a;
            for(int j=0;j<n;j++){
            c+=Math.pow(2,j)*b;
            System.out.print(c+" ");
            }
             System.out.println(); 
        }
        
        in.close();
    }
}
    

