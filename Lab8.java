import java.util.Scanner;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter father's age");
        int Fage=sc.nextInt();
        System.out.println("Enter son's age");
        int Sage=sc.nextInt();
Father o1=new Father(Fage);
Son o2=new Son(Sage,Fage);
o1.display();
o2.show();
    }
}

class Father{
    int age;
    Father(int age){
        this.age=age;
    }
    void display(){
    if(age<0)
        throw new ArithmeticException("wrong age");
    else
        System.out.println("Father's age is :"+age);
}
}
class Son extends Father{
    int SonAge;
    Son(int SonAge,int age){
        super(age);
        this.SonAge=SonAge;

    }
    void show(){
    if(SonAge>age )
        throw new ArithmeticException("Son's age cannot be greater than father's age");
    else
    System.out.println("Father's age is :"+age+" and fathers age is "+age);
}}
