/**Description: Example of jaggedArray
 * Author: Aswitha
 * date:23-10-2020 
 */

public class jaggedArray {

	public static void main(String[] args) {
		String arr[][]=new String[2][];
		arr[0]=new String[3];
		arr[1]=new String[5];
		arr[0][0]="Mr";
		arr[0][1]="Mrs";
		arr[0][2]="Miss";
		arr[1][0]="Hema";
		arr[1][1]="Hemanth";
		arr[1][2]="Rohit";
		arr[1][3]="Chakri";
		arr[1][4]="Nishanth";
		System.out.println(arr[0][0]+". "+arr[1][0]);
		System.out.println(arr[0][2]+". "+arr[1][1]);
		System.out.println(arr[0][1]+". "+arr[1][2]);
		System.out.println(arr[0][0]+". "+arr[1][3]);
		System.out.println(arr[0][0]+". "+arr[1][4]);

	}

}