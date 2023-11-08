

package basic.java;

import java.util.Scanner;

public class Pattran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of patturn size : ");
        int n = input.nextInt();
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
    
}
