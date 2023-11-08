
package basic.java;

import java.util.Scanner;

public class Assignment18 {

    public static void main(String[] args) {
        String[] weekdays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thirsday", "Friday"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any digit from 1 to 7 : ");
        int n = input.nextInt();

        switch (n) {

            case 1:
                System.out.println(weekdays[0]);
                break;
            case 2:
                System.out.println(weekdays[1]);
                break;
            case 3:
                System.out.println(weekdays[2]);
                break;
            case 4:
                System.out.println(weekdays[3]);
                break;
            case 5:
                System.out.println(weekdays[4]);
                break;
            case 6:
                System.out.println(weekdays[5]);
                break;
            case 7:
                System.out.println(weekdays[6]);
                break;
            default:
                System.out.println("Your input is rong");
                break;
        }
    }
}
