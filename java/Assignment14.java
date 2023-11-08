

package basic.java;

import java.util.Scanner;
public class Assignment14 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);           
        int sum,r,temp,totalplindrome=0;
        System.out.print("Enter the starting number :");
        int m= input.nextInt();
        System.out.print("Enter the last number :");
        int n= input.nextInt();

        for (int i=m ; i<=n ; i++ ){
            sum=0;
            temp=i;        

            while (temp!=0){
                r=temp%10;
                sum=(sum*10)+r;
                temp=temp/10;  
            }
            if (sum==i){
                totalplindrome++;
                System.out.print(i+" ");
            }
          }  
          System.out.println();
          System.out.println("the numbers of plindrome numbers :" + totalplindrome);
    }
}
