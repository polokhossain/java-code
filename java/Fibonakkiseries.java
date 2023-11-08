

package basic.java;
import java.util.Scanner;
public class Fibonakkiseries {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("how many number you need in this series? ");
        int n = input.nextInt();
        int first=0;
        int secound=1;
        int fibo;
        System.out.print("fibonakki series from "+n +" numbers is : "+first+" "+secound);
        for (int i=1;i<=n;i++){
            fibo = first + secound;
            System.out.print(" "+fibo);

            first=secound;
            secound=fibo;
        }
        System.out.println();
    }
    
}
