package CIE;
import java.util.Scanner;
public class Internals extends CIE.Student
{
    public int ciem[]=new int[5];
    Scanner xx =new Scanner (System.in);
    public void accept()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the cie marks of subject"+(i+1)+" out of 50");
            {
                ciem[i]=xx.nextInt();
            }
        }
    }

    
}




package SEE;
import CIE.*;
import java.util.Scanner;

public class Externals extends CIE.Student
{
    public int seem[]=new int[5];
    Scanner xx =new Scanner (System.in);
    public void accept()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the see marks of subject"+(i+1)+" out of 100");
            {
                seem[i]=xx.nextInt();
            }
        }
    }

}




package CIE;
import java.util.Scanner;

public class Student
{
    String name,usn;
    int sem;
    Scanner xx=new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter name:");
        name=xx.nextLine();
        System.out.println("Enter usn:");
        usn=xx.next();
        System.out.println("Enter sem:");
        sem=xx.nextInt();
    }
    public void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Usn :"+usn);
        System.out.println("Sem :"+sem);
    }
}











import CIE.*;
import SEE.*;
import java.util.*;

class TotalMarks
{
    public static void main(String sss[])
    {
        int i,j,n;
        int total[]=new int[5];
        Scanner xx=new Scanner(System.in);
        System.out.println("Enter the number of students");
        n=xx.nextInt();
        CIE.Student s[]=new CIE.Student[n];
        CIE.Internals ci[]= new CIE.Internals[n];
     SEE.Externals se[]=new SEE.Externals[n];
        for(i=0;i<n;i++)
        {
            System.out.println("ENTER STUDENT"+(i+1)+" DETAILS");
            s[i]=new CIE.Student();
            s[i].accept();
            ci[i]=new CIE.Internals();
            ci[i].accept();
            se[i]=new SEE.Externals();
            se[i].accept();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("DETAILS OF STUDENT "+(i+1));
            s[i].display();
            for(j=0;j<5;j++)
            {
                total[j]=ci[i].ciem[j]+(se[i].seem[j]/2);
                System.out.println("Total marks in subject"+(j+1)+" is "+total[j]);
            }
        }
    }
}
