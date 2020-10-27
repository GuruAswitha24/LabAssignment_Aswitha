
import java.util.*;


/*The program accepts a String and checks if it is a positive string
* and prints the output 
* @author  Aswitha
* @date: 24-10-2020
*/
public class PositiveString {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String r= sc.nextLine();
        String str=checkpositive(r);
	}

	private static String checkpositive(String str) {
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i+1)<str.charAt(i))
			{
			   System.out.println("Given String is negative");
		    }
			else
			{
				System.out.println("Given String is positve");
		    }
		}
		return str;
	}

}

