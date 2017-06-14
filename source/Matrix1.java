/* Write a java program to multiply two given matrices*/

import java.io.*;
class Matrix1 
{
	public static void main(String[] args)throws IOException
	{
		int i,j,k;
		BufferedReader br=
new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the order of matA:");
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int A[][]=new int[m][n];
		System.out.println("enter the order of matB:");
		int p=Integer.parseInt(br.readLine());
		int q=Integer.parseInt(br.readLine());
		int B[][]=new int[p][q];
		System.out.println("enter matA elements:");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
	    		   A[i][j]=Integer.parseInt(br.readLine());

		System.out.println("enter matB elements:");
		for(i=0;i<p;i++)
			for(j=0;j<q;j++)
			  B[i][j]=Integer.parseInt(br.readLine());
		System.out.println("the matA is:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
                          System.out.print(A[i][j]+" ");
			System.out.println();
		}
		System.out.println("the matB is:");
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
                          System.out.print(B[i][j]+" ");
			System.out.println();
		}
	int C[][]=new int[m][q];
		if(n==p)
		{
		    for(i=0;i<m;i++)
			{
				for(j=0;j<q;j++)
				{
					C[i][j]=0;
					for(k=0;k<n;k++)
						C[i][j]=C[i][j]+A[i][k]*B[k][j];
				}
			}
			System.out.println("the product of matA and matB:");
			for(i=0;i<m;i++)
			{
				for(j=0;j<q;j++)
					System.out.print(C[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.println("Matrix multiplication is not possible");
	}
}

/*


Output:

enter the order of matA:
2
3
enter the order of matB:
3
2
enter matA elements:
1
2
3
1
2
3
enter matB elements:
1
2
3
1
2
3
the matA is:
1 2 3
1 2 3
the matB is:
1 2
3 1
2 3
the product of matA and matB
13 13
13 13
*/
