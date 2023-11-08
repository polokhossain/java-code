import java.util.Scanner;

public class Assignment142 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int r,temp,sum,totalPalindrome=0;
        
        System.out.print("Enter Starting Number :");
       int m=input.nextInt();
        
        System.out.print("Enter Ending Number :");
       int n=input.nextInt();
        for (int i = m; i <=n; i++) {
            sum=0;
            temp=i;
            
            while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
            }
            if (i==sum) {
               totalPalindrome++;
                System.out.println(sum+" ");
            }
        }
        System.out.println(totalPalindrome);
    } 
}