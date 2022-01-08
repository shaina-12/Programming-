import java.util.Scanner;
public class Pattern
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the no of rows: ");
		int n = input.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=n-i;k>0;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i + " ");
			}
			System.out.print("\n");  
		}
	}
}