

package basic.java;

import java.util.Scanner;
public class PattranInvarse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = input.nextInt();
        for(int row=n;row>=1;row--){
            for (int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
