// Recursive method

import java.io.*;
class Rfebonacci
{
public static void main(String args[]) throws IOException
{
 int n,i;
BufferedReader br=
new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter n value:");
		n=Integer.parseInt(br.readLine());
System.out.println("febonacci series");
for(i=0;i<n;i++)
 System.out.println(feb(i));
 }
 static int feb(int n)
 {
  if(n==0)
  return 0;
  if(n==1)
  return 1;
  else
  return feb(n-1)+feb(n-2);
  }
  }

/*
Output:
Enter the n value:
5
Fibonacci series:
0
1
1
2
3
*/
