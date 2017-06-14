/* Write a java program implements stack ADT.*/

import java.io.*;
class stack
{
	int index=0;
	int a[]=new int[10];
	void push(int num)
	{	if(index==0)
			System.out.println("Stack OverFlow");
		else
		{	a[index++]=num;
			System.out.println("pushed element is:"+num);
		}
	}
	void pop()
	{	if(index==0)
			System.out.println("stack is in underflow");
		else
		{
			System.out.println("poped element is:"+ a[index--]);
		}
	}
	void peep()
	{	if(index<=0)
			System.out.println("no elements in the list");
		else
		{	System.out.println("the list is:");
			for(int i=index-1;i>=0;i--)
				System.out.println(a[i]);
		}
	}
}
class TextStack
{
	public static void main(String[] args)throws IOException
	{	int num,ch;
		stack ob=new stack();
		BufferedReader br=
 				new BufferedReader(new InputStreamReader(System.in));
		do
		{	System.out.println(" 1. Push "); System.out.println(" 2. Pop");

			System.out.println(" 3.Print");  System.out.println("4.Exit");
			System.out.println("Enter Ur choice");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:System.out.println("Enter a no. to push");
						num=Integer.parseInt(br.readLine());
						ob.push(num); 	break;
				case 2:ob.pop(); 			break;
				case 3:ob.peep();			break;
				default:System.out.println("wrong command");
			}
		}while(ch>0&&ch<4);
	}
}

/*


Output:
1. push
2. pop
3. print
4. exit
Enter ur choice 1
Enter  a no. to push
23
pushed element is 23
1. push
2. pop
3. print
4. exit
Enter ur choice 3
the list is:
23
1. push
2. pop
3. print
4. exit
Enter ur choice 2
poped element is:23
1. push
2. pop
3. print
4. exit
Enter ur choice 2
stack is in underflow	
*/