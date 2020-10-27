package lab3;
import java.util.Scanner;

/*The program displays the number of characters, lines and words in a text
* and prints the output 
* @author  Aswitha
* @date: 24-10-2020
*/

public class DisplayText {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int r=calculateWords(s);
	}

	private static int calculateWords(String s) {
		int words=0, character=0,line=0;
		for(int i=0;i<r.length;i++)
		{
			if(r.charAt(i)==' ')
			{
				words++;
			}
			if(r.charAt(i)=='\n')
			{
				line++;
			}
			character++;
		}
		System.out.println("characters "+ character + " words " +words+ "lines"+line);
		return line;
	}

}
