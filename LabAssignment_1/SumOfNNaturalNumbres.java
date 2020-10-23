//Desc: To find sum of natural numbers
//@author:Aswitha

class sumOfNNaturalNumbers {
	int n=3,i,sum=0;
	public void calculateSum() {
		for(i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			} 
		}
		System.out.println("The sum is "+ sum);
	}
	public static void maain(String args[]) {
		sumOfNNaturalNumbers obj=new sumOfNNaturalNumbers();
		obj.calculateSum();
	}
}