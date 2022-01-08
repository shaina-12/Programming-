import java.util.Scanner;
public class Lower_Triangular_Matrix
{
    static boolean check_Lower_Triangular_Matrix(int arr[][],int m,int n)
    {
        if(m != n)
		{
		    return false;
		}
		for(int i=0;i<m-1;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(arr[i][j]!=0)
		        {
		            return false;
		        }
		    }
		}
		return true;
    }
	public static void main(String args [])
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the no of rows of the matrix: ");
		int m = input.nextInt();
		System.out.print("\nEnter the no of columns of the matrix: ");
		int n = input.nextInt();
		int arr[][] = new int [m][n];
		System.out.print("\nEnter the matrix elements: ");
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr[i][j] = input.nextInt();
		    }
		}
		boolean b=check_Lower_Triangular_Matrix(arr,m,n);
		if(b)
		{
		    System.out.print("\nThe matrix is a lower triangular matrix.");
		}
		else
		{
		    System.out.print("\nThe matrix is not a lower triangular matrix.");
		}
		input.close();
	}
}
