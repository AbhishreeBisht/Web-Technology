package abhis;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args)
	{
		int c=0;
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			c++;
		}
		
	}
	if(c>0)
	{
		System.out.println("Number is not prime.");
	}
	else
	{
		System.out.println("Number is prime");
	}
	}
}
