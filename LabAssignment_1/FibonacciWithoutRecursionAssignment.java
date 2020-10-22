//Desc: Fibonacci without Recursion
//@author: Pankaj

import java.util.Scanner;

public class FibonacciWithoutRecursionAssignment {
	static int fibonacci(int num)
	{
	    int a=1,b=1,c;
	    for(int i=0;i<num-2;i++)
	       {
	          c=a+b;
	          a=b;
	          b=c;
	       }
	    return b;
	}

public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num=sc.nextInt();
		        System.out.println(fibonacci(num));
	  }

    }
			
}

