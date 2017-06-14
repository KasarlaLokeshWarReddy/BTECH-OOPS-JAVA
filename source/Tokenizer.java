/* Write a java program that reads a line of integers, and then displays each integers, and the sum of all the integers(use string tokenizer class)*/

import java.util.*;
import java.io.*;
class Tokenizer
{
	public static void main(String[] args)throws IOException
	{
                int sum=0,i;
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string object:");
		String ob=br.readLine();
                StringTokenizer st1=new StringTokenizer(ob);
		System.out.println("no.of tokens are:"+st1.countTokens());
                System.out.println("tokens are: ");
		while(st1.hasMoreTokens())
		{ 
i=Integer.parseInt(st1.nextToken());
sum=sum+i;
System.out.println("  "+i);
}
		System.out.println("summation:"+sum);
	}
}
/*

Output:
enter the string object:
3 4 5
no. of tokens are:3
tokens are:
3
4
5
summation:12
*/
