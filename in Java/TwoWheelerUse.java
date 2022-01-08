import java.util.Scanner;
interface MotorBike
{
	public void inputDistanceTime();
	public void outputDistanceSpeed();
}
interface Cycle
{
	public void getDistanceTime();
	public void showDistanceTime();
}
class TwoWheeler implements MotorBike,Cycle
{
	Scanner input=new Scanner(System.in);
	private float distance;
	private float Times;
	private float speed;
	TwoWheeler()
	{
		this.distance=0.000F;
		this.Times=0.000F;
		this.speed=0.000F;
	}
	public void inputDistanceTime()
	{
		System.out.print("Enter the distance: ");
		distance=input.nextFloat();
        	System.out.print("Enter the time: ");
        	Times=input.nextFloat();
	}
	public void SpeedCalc()
	{
		speed=distance/Times;
	}
	public void outputDistanceSpeed()
	{
		System.out.print("Distance: " + distance + "km");
		SpeedCalc();
        System.out.print("\nSpeed: " + speed + "km/h");
	}
	public void getDistanceTime()
	{
		System.out.print("Enter the distance: ");
		distance=input.nextFloat();
        	System.out.print("Enter the time: ");
        	Times=input.nextFloat();
	}
	public void showDistanceTime()
	{
		System.out.print("Distance: " + distance + "km");
		SpeedCalc();
        	System.out.print("\nSpeed: " + speed + "km/h");
	}
}
public class TwoWheelerUse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		TwoWheeler t=new TwoWheeler();
	   	int choice;
	    	System.out.print("Main Menu \n1.Motor Bike \n2.Cycle \nEnter your choice: ");
		choice=sc.nextInt();
	    	switch (choice)
		{
			case 1: t.inputDistanceTime();
			 		t.outputDistanceSpeed();
			break;
			case 2: t.getDistanceTime();
					t.showDistanceTime();
			break;	
		}
		sc.close();
	}
}
