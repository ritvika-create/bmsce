 import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
double a, b, c, root1, root2;
double det;

Scanner sc= new Scanner (System.in);
System.out.println("Enter the value of b:");
b = sc.nextDouble();
System.out.println("Enter the value of a:");
a = sc.nextDouble();
System.out.println("Enter the value of c:");
c = sc.nextDouble();



det = b*b - 4*a*c;
if (det > 0)
    {
    root1= (-b + Math.sqrt(b*b - 4*a*c))/2*a;
    root2 = (-b -Math.sqrt(b*b - 4*a*c))/2*a;
    System.out.println("First root is:"+root1);
    System.out.println("Second root is:" +root2);
    }

else if ( det == 0)
    {
        root1= -b/(2*a);
       
       System.out.println("Both roots are same and are equal to:" +root1);
       }
else if (det < 0)
      {
         System.out.println("Real roots don't exist");
      
 }
}
}
