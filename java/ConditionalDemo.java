

package basic.java;
import java.util.Scanner;
public class ConditionalDemo {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = input.nextInt();
        
        if (age >= 18){
            System.out.println("Your vote is valid");
            
        }
        else{
            System.out.println("Your vote is invalid");
        }
        
    }
    
}
