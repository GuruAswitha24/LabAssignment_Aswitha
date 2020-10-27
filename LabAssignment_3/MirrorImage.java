
import java.util.Scanner;

/*The program that is to create the mirror image of a String
* and prints the output 
* @author  Aswitha
* @date: 24-10-2020
*/

public class MirrorImage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		String r= getImage(str);
	}

	private static String getImage(String r) {
		int k=r.length(); //stores length of string
		for(int i=0;i<k;i++)
		{
			System.out.print(r.charAt(i)); 
		}
		System.out.print("||");
		for(int i=(k-1); i>=0;i--)
		{
			System.out.println(r.charAt(i));
		}
		return r;
	}

}
