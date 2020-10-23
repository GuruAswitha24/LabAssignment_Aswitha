/*package lab2;
import java.util.Arrays;
public class SortStrings{
	public String sortStrings(String array) {
		char charArray[] = array.toCharArray();
		Arrays.sort(charArray);
		return String(charArray);
	}
} */
package Lab2;
import java.util.Scanner;
import java.util.Arrays;

/**
* <h1>Sorting of elements in Alphabetical order</h1>
* The Sort Strings program implements an application that simply 
* sorts elements in the left half be in Upper case and
* in the right half be in the Lower case in the given sets of name and
* prints the output of screen
* @author  Aswitha
* @date: 23-10-2020
*/

public class SortStrings {
	public static void main(String[] args) {
		// Declaration and Initialization 
		String[] names = new String[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the names: ");
		for (int i=0;i<((names.length/2)+1 );i++ ) {
			names[i] = sc.next();
		}
		for(int i=((names.length/2)+1 );i<names.length;i++) {
			names[i]=sc.next();
	    }
		Arrays.sort(names);
		for (int i=0;i<names.length ;i++) {
			//prints the given names in sorted manner
			System.out.println("Name are " + names[i]);
		}
	}
}