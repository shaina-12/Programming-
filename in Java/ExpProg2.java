import java.util.Scanner;
class MyClass
{
	Scanner sc=new Scanner(System.in);
	private void MyMethod1()
	{
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		System.out.print("Enter the index to access the character in the string: ");
		int c= sc.nextInt();
		char ch = str.charAt(c);
		System.out.print("The character present in that index of the string is: " + ch);
	}
	private void MyMethod2()
	{
		MyMethod1();
	}
	public void MyMethod3()
	{
		try {
			MyMethod2();
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.print("Exception Caught: Accesing the invalid index of the string.");
		}
		finally {
			System.out.print("\nProcess Terminated.");
		}
	}
}
public class ExpProg2 
{
	public static void main(String[] args) 
	{
		MyClass m= new MyClass();
		m.MyMethod3();
	}
}
