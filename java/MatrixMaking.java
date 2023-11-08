
package basic.java;

import java.util.Scanner;


public class MatrixMaking {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int A[][] = new int[3][5]; 
        int B[][] = new int[3][5]; 
        
        System.out.println("Enter the value of matrix A : ");//getting input for a matrix
        for (int row=0;row<3;row++){
            for (int col=0;col<5;col++){
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col]=input.nextInt();
                
            }
        }
        System.out.println("Enter the value of matrix B : ");//getting input for b matrix
        for (int row=0;row<3;row++){
            for (int col=0;col<5;col++){
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col]=input.nextInt();
            }
        }
        System.out.println("the matrix valu of A : ");
        for (int row=0;row<5;row++){
            for (int col=0;col<5;col++){
                System.out.println(" "+A[row][col]);
            }
        }
        System.out.println("the matrix valu of B : ");
        for (int row=0;row<5;row++){
            for (int col=0;col<5;col++){
                System.out.println(" "+B[row][col]);
            }
        }
    }
}
