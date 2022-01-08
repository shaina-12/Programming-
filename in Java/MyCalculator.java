import java.util.Scanner;
interface AdvancedArithmetic
{
	int divisor_sum(int n);
}
public class MyCalculator {
	int divisor_sum(int n) {
		int sum=0; 
		if(n==0)
		{
			return 1;
		}
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		MyCalculator mc = new MyCalculator();
		System.out.print("Enter the number: ");
		int n = s.nextInt();
		int result= mc.divisor_sum(n);
		System.out.print("The sum of all the divisors of the number is: " + result);
	}
}