

package basic.java;

public class UnaryDemo {
    public static void main(String[] args){
        
        int x = 25;
        int y;
        y = +x;
        System.out.println("y =" + y);//the value of x will multiplayer with (+)plus operator
        y = -x;
        System.out.println("y =" + y);// the value of x will multiplayer with (-)mynas operator
        y = ++x;
        System.out.println("y =" + y);//the current value of x is increasied this time
        y = x++;
        System.out.println("y =" + y);// the current value of x will increased when x is use again after this operation
        y = --x;
        System.out.println("y =" + y);//the current value of x decreased this time 
        y = x--;
        System.out.println("y =" + y);// the current value of x will decreased when x is use again after  this operation
           
        
        
    }
    
}
