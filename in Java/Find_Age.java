import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Find_Age
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the date of birth: ");
int date = input.nextInt();
int month = input.nextInt();
int year = input.nextInt();
LocalDate dob = LocalDate.of(year,month,date);
LocalDate now = LocalDate.now();
Period diff = Period.between(dob,now);
System.out.print("Your age is: " + diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days.");
}
}