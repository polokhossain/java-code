
package basic.java;

import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the initial value");
        int m = input.nextInt();
        System.out.print("enter the last value");
        int n = input.nextInt();
        int count = 0, totalnumber = 0;

        for (int i = m; i <= n; i++) {
            if (i == 0 || i == 1) {

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {

                        count++;
                        break;
                    }
                }
                if (count == 0 && i>1 ) {
                    System.out.println(i);

                    totalnumber++;
                }
                count = 0;

            } else {

            }
            System.out.println("the number of prime number of this range" + totalnumber);
        }

    }

}
