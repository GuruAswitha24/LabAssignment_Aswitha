// Desc: Finding out sum of cubes of a number
//  @author: Pankaj

public class CubeSumAssignment {
    static int i,number,result=0;
	public static void main(String[] args) {
	  int result=CubeSum(1234);
          System.out.println("CubeSum is:" +result);
	}
private static int CubeSum(int i) {	
	while(i!=0) 
	   {
		number=i%10;
		result=result+number*number*number;
		i=i/10;
			
	   }

	return result;
   }

}
