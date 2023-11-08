package basic.java;
import java.util.Scanner;
public class Assignment13 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please type the value of n : ");
        int n = input.nextInt();
        int first=0;
        int secound=1;
        int fibo=0;
        for (int i=3;i<=n;i++){
            fibo = first + secound;

            first=secound;
            secound=fibo;
        }
        System.out.print("The "+n+"th"+" position of fibonakki series is = "+fibo);

        System.out.println();
    }
    
}
