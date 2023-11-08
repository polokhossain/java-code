
package basic.java;

import java.util.Scanner;

public class TempatatureDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of farenhide:");
        double faren = input.nextDouble();
        double cels = (double) ((5*(faren - 32)/9));
        System.out.println("The value of celcious is "+ cels + "  celcious");
    }
    
}
