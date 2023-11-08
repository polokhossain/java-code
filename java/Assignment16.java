
package basic.java;
import java.util.Scanner;
public class Assignment16 {
    public static void main(String[] args) {
        int password= 12345;
        Scanner input=new Scanner(System.in);
        System.out.println("You can take 3 chance to crack");
        for(int i=1;i<=3;i++){
            System.out.print("Enter your user name : ");
            String n= input.next();
            System.out.print("Enter your password ");
            int p=input.nextInt();
            if("ANIS".equals(n) && password==p){
                System.out.println("Welcome to your system.");
                break;
            }
            else{
                System.out.println("your password or username is incorrect. plese try agian later. ");
            }  
               
        }
    }
}
