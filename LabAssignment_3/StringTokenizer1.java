

import java.util.*;

/*The program that reads a line of integers and then displays each integer
*  and prints the sum of all integers. 
* @author  Aswitha
* @date: 24-10-2020
*/
 
public class StringTokenizer1 {
    public static void main(String args[]) {
        int n, sum = 0; // Declaration of variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers:"); 
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) // check for the availability of tokens
        {
            String temp = st.nextToken();  //storing the tokens in temp variable
            n = Integer.parseInt(temp); //converting to integer
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of all integers is: " + sum); // prints the sum of all integers
        sc.close();
    }
}