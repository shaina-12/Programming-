import java.util.Scanner;

class Accounts
{
	Scanner input = new Scanner (System.in);
	private String depoName;
	private String accNo;
	private String accType;
	private float balAmount;
	Accounts()
	{
		System.out.print("WELCOME TO ABC BANK.\n");
		this.depoName = "No Name";
		this.accNo = "ACC000";
		this.accType = "Savings";
		this.balAmount = 0.000F;
	}
	public void getAmt()
	{
		System.out.print("Enter the name: ");
		depoName=input.nextLine();
		System.out.print("Enter the account number: ");
		accNo=input.nextLine();
		System.out.print("Enter the account type: ");
		accType=input.nextLine();
		System.out.print("Enter the balance amount: Rs.");
		balAmount=input.nextFloat();
	}
	public void compute()
	{
		float minbal=1000.000F;
		float amtD,amtW;
		int choice;
			System.out.print("\nEnter your choice (1.deposit and 2.withdrawal): ");
			choice=input.nextInt();
			switch (choice)
			{
				case 1:System.out.print("\nEnter the amount to be deposited: Rs.");
					   amtD=input.nextFloat();
					   balAmount=balAmount+amtD;
				break;
				case 2:if(balAmount<minbal)
				       {
					 		System.out.print("The amount cannot be withdrawn. So, we will cut Rs 10 from your account.");
					 		balAmount=balAmount-10;
				       }
				       else
				       {
				    	   System.out.print("\nEnter the amount to be withdrawed: Rs.");
						   amtW=input.nextFloat();
						   balAmount=balAmount-amtW;
				       }
				break;
			}
	}
	public void showAmt()
	{
		compute();
		System.out.print("\nName: " + depoName);
		System.out.print("\nAccount Number: " + accNo);
		System.out.print("\nAccount type: " + accType);
		System.out.print("\nBalance amount: Rs." + balAmount);
	}
}
public class BankAccount1 {
	public static void main(String[] args) {
		Accounts a = new Accounts();
		a.getAmt();
		a.showAmt();
	}
}
