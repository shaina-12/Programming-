import java.util.Scanner;
class Library{
	Scanner sc = new Scanner(System.in);
	String name;
	int iss;
	int ret;
	boolean val;
	Library()
	{
		this.name="No Name";
		this.iss=0;
		this.ret=0;
		this.val=false;
	}
	synchronized public void getEntry()
	{
		while(!val) {
			try {
				wait(10);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		System.out.print("Enter the name: ");
		name=sc.next();
		System.out.print("Enter the no of books issued: ");
		iss=sc.nextInt();
		System.out.print("Enter the no of books returned: ");
		ret=sc.nextInt();
		val=true;
	    notify();
		}
	}
	synchronized public void showEntry()
	{
		while(val)
		{
			try {
				wait(10);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		System.out.print("\nName: " + name);
		System.out.print("\nNo of books issued: " + iss);
		System.out.print("\nNo of books returned: " + ret);
		System.out.print("\n");
		val=false;
		notify();
		}
	}
}
class Entry implements Runnable{
	Library l;
	Thread t;
	Entry(Library l)
	{
		this.l=l;
		t = new Thread (this,"Enter");
	}
	public void run()
	{
		while(true) {
			l.getEntry();
		}
	}
}
class Shows implements Runnable{
	Library l;
	Thread t;
	Shows(Library l)
	{
		this.l=l;
		t = new Thread (this,"Show");
	}
	public void run()
	{
		while(true) {
			l.showEntry();
		}
	}
}
public class LibraryUse {
	public static void main(String[] args) {
	  Library l = new Library();
	  Entry ent = new Entry(l);
	  Shows sh = new Shows(l);
	  ent.t.start();
	  sh.t.start();
	}
}
