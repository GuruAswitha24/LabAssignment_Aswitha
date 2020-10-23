package Lab2;
import java.util.Arrays;
import java.util.Scanner;
/**
* <h1>To get the given array values reverse and sorted</h1>
* The reverseSort program implements an application that
* reverses and sort the given array values
* prints the output on the screen
* @author  Aswitha
* @date: 23-10-2020
*/
public class reverseSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4]; // Declaration and Initialization 
		System.out.println("Enter array values:");
		for(int i=0;i<4;i++) {
		  a[i]=sc.nextInt();
		  }
		reverseSort obj=new reverseSort();
		obj.revArray(a);
	}

void revArray(int a[])
{
		String str=Arrays.toString(a);
		Arrays.sort(a);
		// prints the sorted array
	    System.out.println("sorted array is:"+Arrays.toString(a));
	    
	}


}



