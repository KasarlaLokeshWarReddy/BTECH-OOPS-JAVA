/* The Fibonacci sequence is defined by the following rule. The first two values in the sequence are 1 and 1. Every subsequent values preceding it. Write a java program that uses both recursive and non-recursive functions to print the nth value in the Fibonacci sequence*/
//Non-recursive Method
import java.io.*;
class Fibonac
{
	int a=1,b=1;
	void fib(int n)
	{
		if(n>0)
		{
			System.out.println("fibonacci series is:");
			System.out.println(1+"\n"+1);

			for(int i=n;i>0;i--)
			{
				int c=a+b;
				a=b;
				b=c;
				System.out.println(c);
			}
		}
		else
			System.out.println("no series");
	}
}
class FibDemo2
{
	public static void main(String[] args)throws IOException
	{
		Fibonac f=new Fibonac();
		BufferedReader br=
new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter n value:");
		int n=Integer.parseInt(br.readLine());
		f.fib(n);
	}
}

/*

Output:
Enter the n value:
5
Fibonacci series is:
1
1
2
3
5

*/