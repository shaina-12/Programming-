import java.util.Scanner;
class Exceptions
{
	Scanner sc = new Scanner(System.in);
	public Exceptions(String s)
	{
		try {
			System.out.print("Enter the index to access the character in the string: ");
			int c= sc.nextInt();
			char ch = s.charAt(c);
			System.out.print("The character present in that index of the string is: " + ch);
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
public class ExpProg3 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc1.nextLine();
		Exceptions e = new Exceptions(str);
		sc1.close();
	}
}
