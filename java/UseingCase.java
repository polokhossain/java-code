
package basic.java;

import java.util.Scanner;
public class UseingCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Chose your option from (1.Bengali/2.Hindi/3.Urdu)  :");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Slected language is Bengeli");
                break;
            
            case 2:
                System.out.println("Slected language is Hindi");
                break;
            
            case 3:
                System.out.println("Slected language is Urdu");
                break;
                
            default:
                System.out.println("slected language is English.");
            }
          
        }
    }
    
}
