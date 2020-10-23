package Lab2;
import java.util.Arrays;
import java.util.Scanner;

/* <h1>Remove the duplicate elements in the given array</h1>
* The removeDuplicates program implements an application that simply 
* remove elements in the given array and get sorted
* prints the output of screen
* @author  Aswitha
* @date: 23-10-2020
*/

public class removeDuplicates {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      // Declaration and Initialization
      int[] a = new int[5];
      int[] b = new int[5];
      System.out.println("Enter the elements of the array :");
      for(int i=0; i<5; i++) {
         a[i] = sc.nextInt();
      }
      // prints the created array elements
      System.out.println("The array created is :"+Arrays.toString(a));
      for(int i=0; i<5; i++) 
      {
         for (int j=0; j<5; j++) 
         {
        	 if(a[i]!=a[j])
             {
        		 b[i++]=a[i];
             }
         }
      }
      //prints the array after removing the elements
      System.out.println("Array after removing elements :"+Arrays.toString(b));
   }
}

