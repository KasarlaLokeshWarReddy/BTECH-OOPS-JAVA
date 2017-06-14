
/* Write a java program for creating multiple threads*/
class NewThread implements Runnable 
{
	String name;
	Thread t;
	NewThread(String threadname)
	{	name=threadname;
		t=new Thread(this,name);
		System.out.println("New thread"+t);
		t.start();
	}
	public void run()
	{	try
		{	for(int i=5;i>0;i--)
			{	System.out.println(name+":"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{	System.out.println(name+"Interrupted");
		}
		System.out.println(name+"exiting");
	}
}
class MultiThreadDemo
{	public static void main(String[] args) 
	{	new NewThread("One");	new NewThread("Two");
		new NewThread("Three");
		try
		{	Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{	System.out.println("Main Thread Interuppted");
		}
		System.out.println("Main thread exiting");
	}   
}


/*

Output:
New threadThread[One,5,main]
New threadThread[Two,5,main]
One:5
New threadThread[Three,5,main]
Two:5
Three:5
One:4
Two:4
Three:4
One:3
Two:3
Three:3
One:2
Two:2
Three:2
One:1
Two:1
Three:1
Oneexiting
Twoexiting
Threeexiting
Main thread exiting


*/