
package basic.java;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of n :");
        int n = input.nextInt();
        int fact = 1;
        
        for (int i = 1;i<=n; i++){
            
            fact *= i;
            
        }
        System.out.println("The factorial of "+n +"  is  "+fact);
    }
    
}
