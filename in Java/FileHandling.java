import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
public class FileHandling {
	public static void main(String[] args) {
		try {
			System.out.println("1st Part: To Store The Contents Of The File In The Array:");
			Scanner sc=new Scanner (System.in);
			System.out.println("The file is reading the contents.");
			FileReader f3 = new FileReader("D:/MyFile.txt");
			Scanner fr = new Scanner(f3);
			ArrayList <String> a = new ArrayList<>(); 
			while(fr.hasNext()) {
				String data= fr.next();
				a.add(data);
			}
			System.out.println("The file has read the contents sucessfully");
			fr.close();
			System.out.println("The contents of the file are: ");
			for(int i=0;i<a.size();i++)
			{
				System.out.println(a.get(i));
				System.out.print("\n");
			}
			System.out.println("2nd Part: Find The longest String In The File:");
			String s=a.get(0);
			int len=a.get(0).length();
			for(int i=1;i<a.size();i++)
			{
				if(len<a.get(i).length()) {
					s=a.get(i);
					len=a.get(i).length();
				}
			}
			System.out.println("The longest string in the file is: "+ s);
		}
		catch(IOException e1) {
			System.out.println("Exception Occured 1");
			e1.printStackTrace();
		}
	}
}
