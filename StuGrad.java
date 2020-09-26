import java.util.Scanner;

public class StuGrad  {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CIE marks out of 50 and SEE marks out of 100 of the student");
		double cie = sc.nextDouble();
                double see = sc.nextDouble();
                double total = (see/2.0)+cie;
		if( cie>=20 && see>=40 )
	             {  
                          if(total>90 && total<=100) 
                           System.out.println("Grade : S");

                          else if(total>80 && total<=90) 
                           System.out.println("Grade : A");

                          else if(total>70 && total<=80) 
                           System.out.println("Grade : B");

                          else if(total>60 && total<=70) 
                           System.out.println("Grade : C");

                          else if(total>50 && total<=60) 
                           System.out.println("Grade : D");

                          else if(total>40 && total<=50) 
                           System.out.println("Grade : E");
                        }
                 else 
		System.out.println("Grade : F");
	
                 
               }

                  }
                  
