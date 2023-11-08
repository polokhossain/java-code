
package basic.java;
import java.util.Scanner;
public class ArrayOpration {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double[] number = new double[5];
        double sum=0;
        System.out.print("Enter your 5 numbers : ");
        for (int i=0;i<number.length;i++){
            number[i]=input.nextInt();
        }
        for (int i=0;i<number.length;i++){
            sum=sum+number[i];
        }
        System.out.println("sum of this array is "+sum);
        System.out.println("average of this array is "+sum/number.length);
        
        double max=number[0];
        for (int i=1;i<number.length;i++){
            if (max<number[i]){
                max=number[i];
            }
        }
        System.out.println("max number of this array is " +max);
        
        double min=number[0];
        for (int i=1;i<number.length;i++){
            if (min>number[i]){
                min=number[i];
            }
        }
        System.out.println("max number of this array is "+min);


    }
    
}
