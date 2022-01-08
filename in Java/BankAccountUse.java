import java.util.Scanner;
class accounts{
	Scanner input = new Scanner(System.in);
	String ID;
	String name;
	float balAmt;
	boolean value;
	accounts(){
		this.ID="ACC000";
		this.name="No Name";
		this.balAmt=0.000F;
		this.value=false;
	}
	synchronized public void getAmt(){
		float a;
		float b;
		int choice;
		//System.out.print("\n");
		while(!value) {
		try {
			wait(10);               
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.print("Enter the account number: ");
		ID=input.next();
		System.out.print("Enter the name: ");
		name=input.next();
		System.out.print("Enter the balance amount: Rs.");
		balAmt=input.nextFloat();
		System.out.print("Do ypu want to deposit(0) or withdraw(1) the amount.");
		choice = input.nextInt();
		switch(choice)
		{
			case 0: System.out.print("Enter the amount to be deposited.");
			        a = input.nextInt();
			        balAmt+=a;
			break;
			case 1:System.out.print("Enter the amount to be withdrawn.");
	               b = input.nextInt();
	               balAmt-=b;
			break;
		}
		value = true;
		notify();
		}
	}
	synchronized public void showAmt(){
		while(value) {
		try {
			wait(10);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.print("\nName: " + name);
		System.out.print("\nAccount Number: " + ID);
		System.out.print("\nBalance amount: Rs." + balAmt);
		System.out.print("\n");
		value=false;
		notify();
		}
	}
}
class Insert implements Runnable{
	accounts a;
	Thread t;
	Insert(accounts a){
		this.a=a;
		t = new Thread(this,"Insert");
	}
	public void run() {
		while(true)
		{
			a.getAmt();
		}
	}
}
class Display implements Runnable{
	accounts a;
	Thread t;
	Display(accounts a){
		this.a=a;
		t = new Thread(this,"Display");
	}
	public void run() {
		while(true)
		{
			a.showAmt();
		}
	}
}
public class BankAccountUse {
	public static void main(String[] args) {
		accounts a = new accounts();
		Insert i = new Insert(a);
		Display d = new Display(a);
		i.t.start();
		d.t.start();
	}
}
