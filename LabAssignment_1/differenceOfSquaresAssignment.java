//Desc: To find difference of squarers
//@author: Aswitha

import java.lang.Math;
class differenceOfSquaresAssignment {
	int n=3, s1, s2, s=0,s22;
	public void calculateDifference() {
		/* for(i=0;i<=n;i++) {
			s1=s1+(i*i);
		} 
		 for(i=0;i<=n;i++) {
			s2=(s2+i)*(s2+i);
		}
		//s=s1-s2; */
		s1=(n*(n+1)*(2*n+1))/6;
		s2=(n*(n+1))/2;
		s22=s2*s2;
		s=Math.abs(s1-s22);
		System.out.println("The difference is "+ s);
	}
	public static void main(String args[]) {
		differenceOfSquaresAssignment obj=new differenceOfSquaresAssignment();
		obj.calculateDifference();
	}
}

