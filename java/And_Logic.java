

package basic.java;

import java.util.Scanner;
public class And_Logic {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Have you complited your masters say (Y/N)  :");
        char answer1 = input.next().charAt(0);
        
        System.out.print("Are you fulent in English say (Y/N)  :");
        char answer2 = input.next().charAt(0);
        
        if ((answer1 == 'y' || answer1 =='Y')&&(answer2 == 'y' || answer2 == 'Y')){
            System.out.println("You are eligible for the interview.");
        }
        else {
            System.out.println("You are not eligible for the interview.");
        }
    }
    
}
