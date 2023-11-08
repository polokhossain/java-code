

package basic.java;
import java.util.Scanner;
public class Assignment12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the sterting value in M");
        int m = input.nextInt();
        System.out.print("Enter the sterting value in N");
        int n = input.nextInt();
        if (m%2!=0 && n%2!=0){

        int sum = 0;
        for (int i = m; i<=n; i += 2){
            
            sum = sum+i;
        }
       
         System.out.println("the sum of "+m +"to "+n +" is "+sum );
        }
        else{
            System.out.println("Your input is even");
        }
    }
    
}
