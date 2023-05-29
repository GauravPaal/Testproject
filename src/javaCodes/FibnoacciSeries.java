package javaCodes;

import java.util.Scanner;

public class FibnoacciSeries
{
public static void main(String[] args)
{
	System.out.println("Please Enter the Position");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	
	int result=fib(n);
	System.out.println("The final output is "+result);
	sc.close();
}
static int fib(int n)
{
	if (n<=1)
	{
		return n;
	}
	else
	{
		int result=fib(n-1)+fib(n-2);
		
		return result;
	}
}
}
