

package basic.java;

class Ooop {
    String name;
    String school;
    int id;
    int phone;
    void show (String n, String x, int i, int p){
        name=n;
        school=x;
        id=i;
        phone=p;
        
    }
    void polok(){
        System.out.println("Teacher name is  "+ name);
        System.out.println("School name is  "+ school);
        System.out.println("Id number is  "+ id);
        System.out.println("phone number is  "+ phone);
        System.out.println("\n\n");
    }
}
public class Oop{
    public static void main(String[] args) {
        
        Ooop teacher1 = new Ooop();
        teacher1.show("md polok hossain", "poradaha high school", 101, 92345);
        teacher1.polok();
        
        Ooop teacher2 =new Ooop();
        teacher2.show("md nafiour rahman nafiz","Ailchara High School", 51118, 97746783);
        teacher2.polok();
        
    }
}