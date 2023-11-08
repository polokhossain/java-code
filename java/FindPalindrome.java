

package basic.java;

import java.util.Scanner;


public class FindPalindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter any number :");
        int num = input.nextInt();
        int sum=0,r,temp = 0;
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=(sum*10)+r;
            temp=temp/10;
            
        }
        if (sum==num){
            System.out.println("This is a plindrome number.");
            
        }
        else{
            System.out.println("This is not a plindrome number");
        }
        
    }
    
}
