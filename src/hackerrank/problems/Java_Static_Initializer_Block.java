
package hackerrank.problems;
import java.util.Scanner;
/**
 *
 * @author Banna
 */
public class Java_Static_Initializer_Block {
    static int B, H;
    static boolean flag;
    
    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        flag = (B>0 && H>0);
        if(!flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
        public static void main(String[] args){
        
            if(flag){
                int ans = B*H;
                System.out.println(ans);
                
                
            }
        
        
        }
}
    

