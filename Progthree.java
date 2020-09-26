import java.util.Scanner;

public class Progthree
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter the value n : ");

		
		int n = sc.nextInt();

		System.out.println("Numbers are : " );
		for(int i=1; i<=n; i++) 
		{
			System.out.println(i);
		}
	}
}
