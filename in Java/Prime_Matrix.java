import java.util.Scanner;
public class Prime_Matrix
{
    static boolean checkPrime(int ele)
    {
        int b = 2;
        int n = ele;
        while(b!=n)
        {
            if(n%b==0)
            {
                return false;
            }
            else
            {
                b++;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the matrix row size: ");
        int m = input.nextInt();
        System.out.print("\nEnter the matrix column size: ");
        int n = input.nextInt();
        int arr[] = new int [m*n];
        int mat[][] = new int [m][n];
        int k = 0;
        while(k<m*n)
        {
            System.out.print("\nEnter the array element: ");
            int val = input.nextInt();
            if(checkPrime(val))
            {
                arr[k] = val;
                k++;
            }
        }
        int l = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = arr[l];
                l++;
            }
            System.out.print("\n");
        }
        System.out.print("\nThe matrix is:\n");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
	input.close();
    }
}
