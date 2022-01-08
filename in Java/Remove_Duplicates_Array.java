//Time complexity is O(n*logn).
import java.util.Scanner;
import java.util.HashMap;
public class Remove_Duplicates_Array
{
	public static void main(String[] args) 
	{
	    HashMap<Integer,Integer> map = new HashMap<>();
	    Scanner input = new Scanner(System.in);  
	    System.out.print("Enter the array limit: ");
	    int n = input.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter the array elements: ");
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = input.nextInt();
	    }
	    int arr2[] = new int[100];
	    int ctr = 0;
	    for(int i=0;i<n;i++)
	    {
	        if(!map.containsKey(arr[i]))
	        {
	            map.put(arr[i],1);
	            arr2[ctr] = arr[i];
	            ctr++;
	        }
	    }
	    System.out.println("The resultant array is: ");
	    for(int i=0;i<ctr;i++)
	    {
	        System.out.print(arr2[i] + " ");
	    }
	    input.close();
	}
}
