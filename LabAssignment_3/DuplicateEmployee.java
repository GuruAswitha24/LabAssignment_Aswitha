import java.util.*;

/*The program is about the duplicate employee details
* @author  Aswitha
* @date: 24-10-2020
*/
public class DuplicateEmployee {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the number of Employees");
		int number = sc.nextInt();
		String[] name = new String[number];
		String[] designation = new String[number];

		for(int i=0;i<number;i++) {       //Getting Employee details
		System.out.println("Enter the Employee Name");
		name[i] = sc.next();
		System.out.println("Enter the Employee Designation");
		designation[i] = sc.next();
		}
		 int duplicateCount= noOfDuplicate(name,designation);    
		 System.out.println("The number of duplicate employee details "+duplicateCount);

	}

	private static int noOfDuplicate(String[] name, String[] designation) {
		int duplicate=0;

		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equalsIgnoreCase(name[j]) && 
						designation[i].equalsIgnoreCase(designation[j])) {  
					duplicate++;
				}
			}

		}
		return duplicate; 
	}
}	