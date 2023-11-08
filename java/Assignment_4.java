
package basic.java;
import java.util.Scanner;
public class Assignment_4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your installment number");
        int installmentnumber = input.nextInt();
        int price = 1800;
        double amount =(double)price/installmentnumber;
        System.out.println("Mounthly installment net amount :"+ amount);
        System.out.printf("mounthly installment amount %.3f ", amount);
        
        
    }
    
}
