 import java.util.*;
class Extraprogram2 {
 public static void main(String ss[]) {
  int l=0,p=0,z=0;
  int a[];
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the number of elements (n):");
  int n = s.nextInt();
  System.out.println("Enter the elements:");
  a = new int[n];
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter a["+i+"]");
   a[i]=s.nextInt();
  }
  for(int i=0;i<n;i++)
  {
   if(a[i]<0)
   {
    l++;
   }
   else if(a[i]>0)
   {
    p++;
   }
   else
   {
    z++;
   }
  }
  System.out.println("Number of positive elements: "+p);
  System.out.println("Number of negative elements: "+l);
  System.out.println("Number of zeros: "+z);
 }
}
