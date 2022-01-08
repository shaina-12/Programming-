import java.util.Scanner;
class Days_Calculation
{
	Scanner input = new Scanner(System.in);
	private int year;
	private int monthNum;
	public void getData()
	{
		System.out.print("Input a month number: ");
		monthNum = input.nextInt();
		System.out.print("Input a year: ");
		year = input.nextInt();
	}
	public boolean checkLeapYear()
	{
		boolean b = true;
		if(year%100 == 0)
      		{
			if(year%400 ==0)
			{
				b = true;
			}
		}
		else if(year%4 == 0)
		{
			b = true;
		}
		else
		{
			b = false;
		}
		return b;
	}
	public void result()
	{
		switch(monthNum)
		{
			case 1: System.out.print("January " + year + " has 31 days");
			break;
			case 2: boolean b  = checkLeapYear(); 
				if(b)
				{
					System.out.print("Febuary " + year + " has 29 days");
				}
				else
				{
					System.out.print("Febuary " + year + " has 28 days");
				}
			break;
			case 3: System.out.print("March " + year + " has 31 days");
			break;
			case 4: System.out.print("April " + year + " has 30 days");
			break;
			case 5: System.out.print("May " + year + " has 31 days");
			break;
			case 6: System.out.print("June " + year + " has 30 days");
			break;
			case 7: System.out.print("July " + year + " has 31 days");
			break;
			case 8: System.out.print("August " + year + " has 31 days");
			break;
			case 9: System.out.print("September " + year + " has 30 days");
			break;
			case 10: System.out.print("October " + year + " has 31 days");
			break;
			case 11: System.out.print("November " + year + " has 30 days");
			break;
			case 12: System.out.print("December " + year + " has 31 days");
			break;
		}
	}
}
public class No_Of_Days
{
	public static void main(String args[])
	{
		Days_Calculation d = new Days_Calculation();
		d.getData();
		d.result();
	}
}