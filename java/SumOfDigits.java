

package basic.java;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of num : ");
        int num = input.nextInt();
        int sum=0,r,temp;
        temp = num;
        while(temp!=0){
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println("sum of those digit is "+sum);
    }
    
}
