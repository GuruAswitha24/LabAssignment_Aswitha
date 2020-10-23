package Lab2;

/**
* <h1>To get the second smallest number</h1>
* The SecondSmallest program implements an application that
* simply finds the second smallest number in the given set and
* prints the output on the screen
* @author  Aswitha
* @date: 23-10-2020
*/

public class SecondSmallest {
	//Declaration of array
	public static int getSecondSmallest(int[] array, int total) {
		int temp; //Declaration of variables
		for( int i=0; i<total; i++) {
			for(int j=i+1; j<total; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[1];
	}
	public static void main(String args[]) {
		//Initialization of Array
		int array[] = {5, 8, 6, 1, 10};
		//Prints the Second smallest number is : on standard output
		System.out.println("Second smallest number is :"+getSecondSmallest(array, 5));
	}
}
