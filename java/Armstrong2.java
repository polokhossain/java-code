import java.util.Scanner;

public class Armstrong2{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int startnum, endnum, HMA= 0, i, r, temp, sum=0;
        System.out.println("Here You can find Armstrong numers from n to m");
        System.out.print("Enter Starting number: " );
        startnum = in.nextInt();
        System.out.print("Enter Ending number: ");
        endnum = in.nextInt();
        in.close();
        System.out.println("Between "+startnum+" to "+endnum+" total armstrong numbers are: ");
        for(i=startnum; i<=endnum; i++){
            temp=i;
            while(temp!=0){
                r= temp%10;
                sum+=(r*r*r);
                temp= temp/10;
            }
            if(i==sum){
                System.out.println(i);
                HMA++;
            }
            sum=0;

        }
        System.out.println("There are a total "+HMA+" Armstrong numbers!!!");

    }
}