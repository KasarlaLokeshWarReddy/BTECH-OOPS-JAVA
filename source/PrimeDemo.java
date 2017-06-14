/* Write a java program that prompts the user for an integer and then prints out all prime numbers up to that integer*/

import java.io.*;
class PrimeDemo 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=
new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		int n=Integer.parseInt(br.readLine());
		int i,num=2;
		boolean prime;
		System.out.println("prime no's are:");
		while(num<n)
		{
			prime=true;
			for(i=2;i<=num/2;++i)
			      if(num%i==0)
			      {
				prime=false;
				break;
			      }
			if(prime==true)
				System.out.println(num);
			num++;
		}
	}
}

/*


Output:
	
	Enter the number:
	7
	prime no’s are:
	2
	3
	5
*/