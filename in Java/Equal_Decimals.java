import java.util.Scanner;
public class Equal_Decimals
{
public static void main(String args [])
{
Scanner input = new Scanner(System.in);
System.out.print("Input floating-point number: ");
float a = input.nextFloat();
System.out.print("Input floating-point another number: ");
float b = input.nextFloat();
float c = a*1000;
float d = b*1000;
int f = (int) c;
int g = (int) d;
if(f == g)
{
System.out.print("They are same");
}
else
{
System.out.print("They are different");
}
}
}
