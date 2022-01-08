class Storage
{
	private int mem;
	public void setStorage(int data)
	{
			this.mem=data;
	} 
	public int getStorage()
	{
		return mem;
	}
}
class Counter extends Thread
{
	Storage s;
	Thread t;
	Counter(Storage s)
	{
		this.s=s;
	}
	public void run()
	{
		int i=0;
		while(i<10)
		{
			s.setStorage(i);
			i++;
		}
	}
}
class Printer extends Thread	
{
	Storage s;
	Thread t;
	Printer(Storage s)
	{
		this.s=s;
	}
	public void run() 
	{
		int i=9;
		while(i>=0)
		{
			System.out.println(Math.abs(i-s.getStorage()) + " is printed.");
			i--;
		}
	}
}
public class CSP {
	public static void main(String[] args) {
		Storage s = new Storage();
		Counter ct = new Counter(s);
		Printer pt = new Printer(s);
		ct.start();
		try {
			ct.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
        pt.start();
	}
}