import java.util.Scanner;

class NegativeException extends Exception{
	NegativeException(String str){
		super(str);
	}
}
public class ExpProg4 {
public static void squareRoot() throws NegativeException{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the real number:");
	double a=sc.nextDouble();
	if(a<0) {
		throw new NegativeException("Exception Caught!");
	}
	else {
		double b=Math.sqrt(a);
		System.out.println("The square root of a number is: " + b);
		}
		sc.close();
}
public static void main (String [] args) {
	try {
		squareRoot();
	}
	catch(NegativeException e){
		System.out.println(e);
	}
}
}
