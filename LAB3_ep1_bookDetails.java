import java.util.*;
class Employee
{
 private int empid;
 private String empname;
 private int empnohrs;
 private double empbasic;
 private double emphra;
 private double empda;
 private double empit;
 private double empgross;
 private double empfinalgross;
 private int empextrahrs;
 private double empextraamt;
 private double emplessamt;
 private double emplesshrs;

void accept()
{
 Scanner ss=new Scanner(System.in);
 System.out.println("Enter employee ID");
 empid=ss.nextInt();
 System.out.println("Enter employee name");
 empname=ss.next();
 System.out.println("Enter number of hours worked by the employee");
 empnohrs=ss.nextInt();
 System.out.println("Enter basic salary of employee");
 empbasic=ss.nextDouble();
 System.out.println("Enter HRA percent");
 emphra=ss.nextDouble();
 System.out.println("Enter DA percent");
 empda=ss.nextDouble();
 System.out.println("Enter IT percent");
 empit=ss.nextDouble(); 
}

void gross()
{
 if(empnohrs==200)
 {
  empgross=empbasic+empbasic*(emphra/100)+empbasic*(empda/100)-empbasic*(empit/100);
  System.out.println("Gross salary of the employee is "+empgross);
 }

 else if(empnohrs>200)
 {
  empgross=empbasic+empbasic*(emphra/100)+empbasic*(empda/100)-empbasic*(empit/100);
  empextrahrs=empnohrs-200;
  empextraamt=empextrahrs*100;
  empfinalgross=empgross+empextraamt;
  System.out.println("Gross salary of the employee is "+empfinalgross);
 }
 else if(empnohrs<200)
 {
  empgross=empbasic+empbasic*(emphra/100)+empbasic*(empda/100)-empbasic*(empit/100);
  emplesshrs=200-empnohrs;
  emplessamt=emplesshrs*100;
  empfinalgross=empgross-emplessamt;
  System.out.println("Gross salary of the employee is "+empfinalgross);
 }

	
}
}
class Main
{
public static void main(String args[])
{
Employee emp=new Employee();
emp.accept();
emp.gross();
}
}
