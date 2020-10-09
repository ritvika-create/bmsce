 import java.util.*;
class Extraprogram4 {
 public static void main(String ss[]) {
  int a[],b[],c[],n1=0,n2=0,sum=0,min,max;
  double avg;
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the number of elements (n):");
  int n = s.nextInt();
  System.out.println("Enter the elements:");
  a = new int[n];
  b = new int[n];
  c = new int[n];
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter a["+i+"]");
   a[i]=s.nextInt();
  }
  for(int i=0;i<n;i++)
  {
   if(a[i]%2 != 0)
   {
    b[n1]=a[i];
    n1++;
   }
   else if(a[i]%2 == 0)
   {
    c[n2]=a[i];
    n2++;
   }
  }
  max=c[0];
  min=c[0];
  for(int i=0;i<n2;i++)
  {
   sum=sum+c[i];
   if(c[i]>max)
    max=c[i];
   else if(c[i]<min)
    min=c[i];
  }
  avg =(double)sum/n2;
  System.out.println("Sum of even elements:"+ sum);
  System.out.println("Average of even elements:"+ avg);
  System.out.println("Maximum of even elements:"+ max);
  System.out.println("Minimum of even elements:"+ min);
 }
}
