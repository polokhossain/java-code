

package basic.java;

import java.util.Scanner;

public class NumberConversation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your decimal  value : " );
        int decimal = input.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        System.out.println("the binary value is = "+binary);
        
        String octal = Integer.toOctalString(decimal);
        System.out.println("the octal value is = "+octal);
        
        String H = Integer.toHexString(decimal);
        System.out.println("the hexadecamal  value is = "+H);
        

        
    }
}
