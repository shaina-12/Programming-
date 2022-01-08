import java.util.Scanner;
public class Inc_And_Dec
{
public static boolean checkIncreasing(int arr[])
{
int val = arr[0];
for(int i=1;i<3;i++)
{
if(val>arr[i])
{
return false;
}
val = arr[i];
}
return true;
}
public static boolean checkDecreasing(int arr[])
{
int val = arr[0];
for(int i=1;i<3;i++)
{
if(val<arr[i])
{
return false;
}
val = arr[i];
}
return true;
}
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int arr[] = new int[3]; 
System.out.print("Input first number: ");
arr[0] = input.nextInt();
System.out.print("Input second number: ");
arr[1] = input.nextInt();
System.out.print("Input third number: ");
arr[2] = input.nextInt();
if(checkIncreasing(arr))
{
System.out.print("Increasing order");
}
else if(checkDecreasing(arr))
{
System.out.print("Decreasing order");
}
else
{
System.out.print("Niether increasing order nor decreasing order");
}
}
}