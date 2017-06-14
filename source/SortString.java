/* Write a java program for sorting a given list of names in ascending order*/

import java.io.*;
class SortString
{
	public static void main(String[] args) throws IOException
	{
BufferedReader br=
new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how many strings:");
		int n=Integer.parseInt(br.readLine());
		String arr[]=new String[n];
		System.out.println("Enter the strings:");
		for(int m=0;m<n;m++)
		{
			arr[m]=br.readLine();
		}	
		System.out.println("The sorted list:");
		for(int j=0;j<arr.length;j++)
		{
			for(int i=j+1;i<arr.length;i++)
			{
				if(arr[i].compareTo(arr[j])<0)
				{
					String t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;
				}
			}
	                       System.out.println(arr[j]);
		}
	}
}


/*
Output:
Enter how many strings:
bat 
rat
ill
rub
mat
The sorted list:
bat
ill
mat
rat
rub
*/