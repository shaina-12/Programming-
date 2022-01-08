import java.util.Scanner;
class Student
{
	public String sName;
	public String sRollNo;
	public char sSec;
	public Student()
	{
		this.sRollNo = "S000";
		this.sName = "No Name";
		this.sSec = 0;
	}
} 
class Exam extends Student
{
	public float maths;
	public float phy;
	public float chem;
	public float cs;
	public float phe;
	public float english;
	public float total;
	public float avg;
	public Exam()
	{
		super();
		this.maths = 0.000f;
		this.phy = 0.00f;
		this.chem = 0.000f;
		this.cs = 0.000f;
		this.phe = 0.000f;
		this.english = 0.000f;
		this.total = 0.000f;
		this.avg = 0.000f;
	}
	public void calTotalAndAverage()
	{
		total = maths + phy + chem + cs + phe + english;
		avg = total / 6;
	}
}
class Result extends Exam
{
	Scanner input = new Scanner(System.in);
	public Result()
	{
		super();
	}
	public void getStuDetails()
	{
		System.out.print("Enter the student details: \n");
		System.out.print("Enter the student name: ");
		super.sName=input.nextLine();
		System.out.print("Enter the roll no: ");
		super.sRollNo=input.nextLine();
		System.out.print("Enter the section: ");
	    super.sSec=input.next().charAt(0);
		System.out.print("Enter the marks of: \nMathematics:");
		super.maths=input.nextInt();
		System.out.print("Physics: ");
		super.phy=input.nextInt();
		System.out.print("Chemistry: ");
		super.chem=input.nextInt();
		System.out.print("Computer Science: ");
		super.cs=input.nextInt();
		System.out.print("Physical Education: ");
		super.phe=input.nextInt();
		System.out.print("English: ");
		super.english=input.nextInt();
	}
	public void showResult()
	{
		System.out.print("The result is: \n");
		System.out.print("\nStudent Name: " + super.sName);
		System.out.print("\nRoll No: " + super.sRollNo);
		System.out.print("\nSection: " + super.sSec);
		System.out.print("\nMarks of:" + "\n" + "Mathematics:" + super.maths);
		System.out.print("\nPhysics: " + super.phy);
		System.out.print("\nChemistry: " + super.chem);
		System.out.print("\nComputer Science: " + super.cs);
		System.out.print("\nPhysical Education: " + super.phe);
		System.out.print("\nEnglish: " + super.english);
		super.calTotalAndAverage();
		System.out.print("\nTotal Marks: " + super.total);
		System.out.print("\nAverage: " + super.avg);
	}
}
public class StudentUse 
{
	public static void main(String[] args) 
	{
		Result a = new Result();
		a.getStuDetails();
		a.showResult();
	}
}