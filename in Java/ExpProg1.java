import java.util.Scanner;
public class ExpProg1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the value of first number: ");
			int a=sc.nextInt();
			System.out.print("Enter the value of second number: ");
			int b=sc.nextInt();
			int c=a/b;
			System.out.print("The answer is: " + c);
			System.out.print("\nEnter the array limit: ");
			int n = sc.nextInt();
			System.out.print("Enter the array elements: ");
			int arr[] = new int [n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.print("Enter the arrat index that you want to access its value: ");
			int ch=sc.nextInt();
			System.out.print("The element present in that array index is: " + arr[ch]);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Exception Caught: Divided by Zero.");
		}
		catch(NegativeArraySizeException e1)
		{
			System.out.print("Exception Caught: Invalid size of the array.");
		}
		catch(ArrayIndexOutOfBoundsException  e2)
		{
			System.out.print("Exception Caught: Accesing the invalid address of the array.");
		}
		System.out.println("\nShaina Mehta");
		sc.close();
	}
}
