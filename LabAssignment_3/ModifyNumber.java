

import java.util.Scanner;
/*The program accepts a number and modifies the number 
* that is equal to the difference between
* two consecutive digits in the original number. 
* and prints the output 
* @author  Aswitha
* @date: 24-10-2020
*/

public class ModifyNumber {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int r=ModifyNumber(num);
        
	}

	private static int ModifyNumber(int r) {
		int sum=0;
		int h=r%10;
		while(r!=0) {
			int a=r%10;
			sum=sum*10+a;
			r=r/10;
		}
		System.out.println(sum);
		while(sum!=0)
		{
			int k=sum%10;
			sum=sum/10;
			int l=sum%10;
			int result=k-1;
			System.out.println(result);
		}
		return r;
	}

	
}
