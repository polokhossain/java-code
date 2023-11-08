//dighat somikoron er programm
import java.util.Scanner;
class Sabbir {
    public static void main(String[] args) {
      
       Scanner input=new Scanner(System.in);
       double a,b,c,D,r,x1,x2;
       System.out.print("Enter first number of A:");
       a=input.nextDouble();
        System.out.print("Enter first number of B:");
       b=input.nextDouble();
        System.out.print("Enter first number of C:");
       c=input.nextDouble();
       D=b*b-4*a*c;
       if(D>0)
       {
           x1=(-b + Math.sqrt(D))/(2*a);
           x2=(-b-Math.sqrt(D))/(2*a);
           System.out.print("Root are"+x1+"And" +x2);
       }
      else if(D==0)
      {
          r=-b/2*a;
          System.out.print("Root are"+r);
      }
      else
      {
          System.out.print("Root are not valid");
      }
    }
}
            
            
        }
        else {
            System.out.println("roots are not vaild");
        }
        
        
     
        
        
        
    }
    
}
