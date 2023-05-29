package javaCodes;

import java.util.Scanner;

public class Power 
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Number");
int n= sc.nextInt();
System.out.println("Enter the power");
int p= sc.nextInt();
int result= solution(n, p);
System.out.println(result);
sc.close();
}
static int solution(int n, int p)
{
if(p==1)
	{
	return n;
	}
else
{
	int result=solution(n,p/2);
	int  FinalResult=result*result;
	if (p%2==0)
	{
		
		return FinalResult;
	}
	else 
	{
		return n*FinalResult;
	}
}
}
}