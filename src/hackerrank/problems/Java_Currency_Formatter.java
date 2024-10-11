
package hackerrank.problems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.Locale;
/**
 *
 * @author Banna
 */
public class Java_Currency_Formatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Create currency formatters for different locales
        Locale usLocale = new Locale("en", "US");
        Locale indiaLocale = new Locale("en", "IN");
        Locale chinaLocale = new Locale("zh", "CN");
        Locale franceLocale = new Locale("fr", "FR");
        
        // Format the currency using the NumberFormat class
        String us = NumberFormat.getCurrencyInstance(usLocale).format(payment);
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(chinaLocale).format(payment);
        String france = NumberFormat.getCurrencyInstance(franceLocale).format(payment);
        
        // Print the formatted outputs
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
}
