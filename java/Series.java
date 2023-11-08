
package basic.java;

import java.util.Scanner;

public class Series {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = input.nextInt();
        double result = 1;
        for (int i = 1 ; i<=n ; i+=1){
            
            result = result*i*i;
            System.out.println(i*i+ " , ");
            
        }
        System.out.println("the result of the multiple series is  "+result);
    }
}
