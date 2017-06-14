/* Write a java program that correctly implements producer consumer problem using the concept of inter thread communication */
class Q 
{	int n;
	boolean valueset=false;
	synchronized int get()
	{
		if(!valueset)
		try
		{	wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("caught");
		}
		System.out.println("get:"+n);
		valueset=false;
		notify();	return n;
	}
	synchronized void put(int n)
	{
		if(valueset)
		try
		{	wait();
		}
		catch(InterruptedException e)
		{	System.out.println("caught");
		}
		this.n=n;	valueset=true;
		System.out.println("put:"+n);
		notify();
	}
}
class Producer implements Runnable
{	Q q;
	Producer(Q q)
	{
		this.q=q;	new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
	while(true)
		{	q.put(i++);
		}
	}
}
class Consumer implements Runnable
{	Q q;
	Consumer(Q q)
	{
		this.q=q;	new Thread(this,"Consumer").start();
	}
	public void run()
	{
		while(true)
		{	q.get();
		}
	}
}
class Pc
{
	public static void main(String[] args) 
	{
		Q q=new Q();
		new Producer(q);	new Consumer(q);
		System.out.println("press ctrl+c to stop");
	}
}

/*

Output:
press ctrl+c to stop
put:0
get:0
put:1
get:1
put:2
get:2

*/