package javaCodes;

import java.util.Scanner;

public class Recurtion 
{
public static void main(String[] args)
{

	System.out.println("Enter the Number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	//int result=fectorialNum(n);
	System.out.println("Fectorial of Given Number "+fectorialNum(n));

	
}
static int fectorialNum(int n)
{
	
	if (n==0||n==1)
	{
		int result=1;
		return result;
	}

else
{
	int result=n*fectorialNum(n-1);
	
	return result;	
}
}
}