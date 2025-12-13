import java.util.Scanner;

public class CompareNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else if(a<b)
		{
			System.out.println(a+" is smaller than "+b);
		}
		else
		{
			System.out.println("Both number are equal!");
		}
		sc.close();
	}
}
