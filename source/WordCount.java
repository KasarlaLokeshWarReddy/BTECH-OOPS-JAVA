/* Write a Java program to make frequency count of words in a given text.*/

class Wordcount
{
public static void main(String a[])
{
int count[]=new int[a.length];
int i,j;
boolean checked[]=new boolean[a.length];
for(i=0;i<a.length;i++)
{
checked[i]=false;
count[i]=1;
}
for(i=0;i<a.length-1;i++)
{
for(j=i+1;j<a.length;j++)
{
if(!checked[j])
{
if(a[i].equals(a[j]))
{
count[i]++;
checked[j]=true;
}
}
}
}
for(i=0;i<a.length;i++)
if(!checked[i])
System.out.println("frequency count of "+a[i]+" "+count[i]);
}
}

/*
Output:
D:\>java Wordcount java is an oop oop
Frequency count of java 1
Frequency count of is 1
Frequency count of an1
Frequency count of oop 2
*/
