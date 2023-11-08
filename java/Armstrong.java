
package basic.java;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum,r,temp,count=0;
        System.out.print("Enter the first number value : ");
        int m = input.nextInt();
        System.out.print("Enter the last number value : ");
        int n= input.nextInt();
        
        for (int i=m;i<=n;i++){
            sum=0;
            temp=i;
            while(temp!=0){
                r=temp%10;
                sum=sum+r*r*r;
                temp= temp/10;
                
            }
            if (sum==i){
                System.out.println(i);
                count++;
                
                
            }
            
        }
        System.out.print("the number of armstrong is "+count);        
        System.out.println();

        
    }
    
}
