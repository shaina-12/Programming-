import java.util.Scanner;
public class Quadratric_Equation
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input a: ");
		double a = input.nextDouble();
		System.out.print("Input b: ");
		double b = input.nextDouble();
		System.out.print("Input c: ");
		double c = input.nextDouble();
		double aux = Math.pow(b,2)-4*a*c;
		if(aux < 0)
		{
			System.out.print("The quadratric equation cannot be solved.");
                }
                else if(aux == 0)
		{
			double root1 = (-1*b)/(2*a);
			System.out.print("The roots are " + root1 + " and " + root1);
		}
		else
		{
			double d = Math.sqrt(aux);
			double h = -1*b;
			double root1 = (h-d)/(2*a);
			double root2 = (h+d)/(2*a);
			System.out.print("The roots are " + root1 + " and " + root2);
		}
	}
}