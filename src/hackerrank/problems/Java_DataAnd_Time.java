/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank.problems;
import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author Banna
 */
public class Java_DataAnd_Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek().toString());
        
        
        scanner.close();
    }
}
