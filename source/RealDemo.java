/* Write a java program that print all real solutions to the quadratic equation 
    ax2+bx+c=0. Read in a,b,c and use the quadratic formula. If the discriminant
    b2-4ac is negative display a message stating that there are no real solutions.*/

import java.io.*;
class RealDemo
{
	public static void main(String[] args)throws IOException
	{
	BufferedReader br=
new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values of a,b&c");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		int dis=b*b-(4*a*c);
		if(dis<0)
		{
			System.out.println("there are no real solutions");
		}
		else
		{
			float sol1=(float)((-b)+Math.sqrt(dis))/(2*a);
			float sol2=(float)((-b)-Math.sqrt(dis))/(2*a);
			System.out.println("real solutions of the problem:");
			System.out.println(sol1+"\n"+sol2);
		}
	}
}


/*
Output:
Enter the values of a,b&c:
2
3
4
there are no real solutions
*/
