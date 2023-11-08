package basic.java;

import java.util.Scanner;

public class primebasic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your initial value");
        int m = input.nextInt();
        System.out.print("enter your last value");
        int n = input.nextInt();
        int count = 0;
        int totalprime = 0;
        for (int i = m; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i > 1) {
                System.out.println(i);
                totalprime++;
            }
            count = 0;
        }
        System.out.println("total number of prime " + totalprime);

    }
}
