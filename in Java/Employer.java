import java.util.Scanner;
abstract class Employees
{
	public abstract void getData();
	public abstract void showData();
}
class Programmer extends Employees
{
	Scanner sc1=new Scanner(System.in);
	private String pName;
	private String pID;
	private float pSalary;
	public void getData()
	{
		System.out.print("Enter the programmer ID: ");
		pID = sc1.nextLine();
		System.out.print("Enter the programmer name: ");
		pName = sc1.nextLine();
		System.out.print("Enter the programmer salary: ");
		pSalary = sc1.nextFloat();
	}
	public void showData()
	{
		System.out.println("I.D.: " + pID);
		System.out.println("Name: " + pName);
		System.out.println("Salary: " + pSalary);
	}
}
class Analyst extends Employees
{
	Scanner sc2=new Scanner(System.in);
	private String aName;
	private String aID;
	private float aSalary;
	public void getData()
	{
		System.out.print("Enter the analyst ID: ");
		aID = sc2.nextLine();
		System.out.print("Enter the analyst name: ");
		aName = sc2.nextLine();
		System.out.print("Enter the analyst salary: ");
		aSalary = sc2.nextFloat();
	}
	public void showData()
	{
		System.out.println("I.D.: " + aID);
		System.out.println("Name: " + aName);
		System.out.println("Salary: " + aSalary);
	}
}
class Project_Leader extends Employees
{
	Scanner sc3=new Scanner(System.in);
	private String plName;
	private String plID;
	private float plSalary;
	public void getData()
	{
		System.out.print("Enter the project leader ID: ");
		plID = sc3.nextLine();
		System.out.print("Enter the project leader name: ");
		plName = sc3.nextLine();
		System.out.print("Enter the project leader salary: ");
		plSalary = sc3.nextFloat();
	}
	public void showData()
	{
		System.out.println("I.D.: " + plID);
		System.out.println("Name: " + plName);
		System.out.println("Salary: " + plSalary);
	}
}
public class Employer 
{
	public static void main(String[] args) 
	{
		Programmer p = new Programmer();
		Scanner sc = new Scanner(System.in);
		Analyst a = new Analyst();
		Project_Leader pl = new Project_Leader();
		int choice;
		System.out.print("Main Menu. \n1.Programmer. \n2.Analyst. \n3.Project Leader. \nEnter your designation: ");
		choice = sc.nextInt();
		switch (choice)
		{
			case 1: p.getData();
					p.showData();
			break;
			case 2: a.getData();
					a.showData();
			break;
			case 3: pl.getData();
					pl.showData();
			break;
		}
		sc.close();
	}
}
