import java.util.Scanner;
class Employee
{
	Scanner input = new Scanner(System.in);
	private String empName;
	private String empID;
	private String empD;
	private float salary;
	Employee()
	{
		this.empName = "No Name";
		this.empID = "E000";
		this.empD = "None";
		this.salary = 0.000f;
	}
	public void getEmpDetails()
	{
		System.out.print("Enter the employee ID: ");
		empID = input.nextLine();
		System.out.print("Enter the employee name: ");
		empName = input.nextLine();
		System.out.print("Enter the employee designation: ");
		empD = input.nextLine();
		System.out.print("Enter the employee salary: ");
		salary = input.nextFloat();
	}
	private void incSal()
	{
		if(empD.compareToIgnoreCase("Manager") == 0)
		{
			salary = salary + 5000;
		}
		else if(empD.compareToIgnoreCase("General Manager") == 0)
		{
			salary = salary + 10000;
		}
		else if(empD.compareToIgnoreCase("CEO") == 0)
		{
			salary = salary + 20000;
		}
		else 
		{
			salary = salary + 2000;
		}
	}
	public void showEmpDetails()
	{
		System.out.println("I.D.: " + empID);
		System.out.println("Name: " + empName);
		System.out.println("Designation: " + empD);
		System.out.println("Salary: " + salary);
		incSal();
		System.out.println("Updated Salary: " + salary);
	}
}
public class EmployeeUse 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.getEmpDetails();
		e.showEmpDetails();
	}
}
