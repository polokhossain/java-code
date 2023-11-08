
package basic.java;

import java.util.Scanner;
public class Product3 {
    
    public static void main(String[] args) {
        
        int id;
        String title;
        int price;
        String description;
        String catagory;
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter your id number : ");
        id = input.nextInt();
        System.out.println("enter the title");
        title = input.next();
        System.out.println("enter the price");
        price = input.nextInt();
        System.out.println("enter the description");
        description = input.nextLine();
        System.out.println("enter the catagory");
        catagory = input.nextLine();
        
        System.out.println("my id : "+ id);
        System.out.println("Name: "+title);
        System.out.println("the cost of this product is "+ price +"euros" );
        System.out.println("Must read the description :"+ description );
        System.out.println("catagory :"+ catagory);
        System.out.println("Thank you sir");
    
   
    }
    
}
