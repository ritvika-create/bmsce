 import java.util.Scanner; 
  class Extraprograme1{ 
    public static void main(String args[]) 
    { 
 Scanner ss=new Scanner(System.in);
        int a[],n,even = 0, odd = 0; 
 System.out.println("Enter the number of elements");
 n=ss.nextInt();
 a=new int[n];
        System.out.println("Enter the elements:");
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter a["+i+"]");
   a[i]=ss.nextInt();
  }
         for (int i = 0; i < n; i++) { 
            if (i % 2 == 0) 
                even += a[i]; 
            else
                odd += a[i]; 
        } 
  
        System.out.println("Sum of even indices of the array: " + even); 
        System.out.println("Sum of odd indices of the array: " + odd); 
    } 
}
