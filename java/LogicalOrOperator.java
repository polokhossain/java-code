
package basic.java;
import java.util.Scanner;
public class LogicalOrOperator {
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        System.out.print("Do you love java :  " );
        char answer = input.next().charAt(0);
        
        if (answer == 'Y' || answer == 'y'){
            System.out.println("You are a java lover");
        }
        else{
            System.out.println("You are not a java lover");
                 
        }
        
        
    }
    
}
