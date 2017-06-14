/* Write a java program that checks whether a given string is a palindrome or not. Ex: MADAM is a palindrome*/

import java.io.*;
class  Palindrome
{
	public static void main(String[] args)throws IOException
	{
		int k=0;
		String str=new String();
		BufferedReader br=
new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string");
		str=br.readLine();
		int n=str.length();
		char ch[]=new char[n];
		for(int i=n-1;i>=0;i--)
		{
			ch[k++]=str.charAt(i);
		}
		String str1=new String(ch);
		if(str1.equals(str))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not palindrome");
	}
}


/*
Output:

Enter string
Malayalam
Given string is palindrome
*/