
package basic.java;
import java.util.Scanner;
public class MultiplySeries {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n");
        int n = input.nextInt();
        
        for (int i = 1; i<=10; i++){
            int result= n*i;
            System.out.println(n+"x"+i+" = "+result);
        }
        
    }
    
}
