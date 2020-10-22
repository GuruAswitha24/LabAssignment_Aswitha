//Desc: to check a given number is increasing
//@author: Pankaj

class increasingNumber {
	int n=134468;
	public void checkNumber() {
	String s = Integer.toString(n);
	  char ch;
	    int f = 0;
	     for(int i=0; i<s.length()-1; i++)
	        {
	            ch = s.charAt(i);
	            if(ch>s.charAt(i+1))// If any digit is more than next digit then we have to stop checking
	            {
	                f = 1;
	                break;
	            }
	        }
	        if(f==1)
	            System.out.println("no");
	        else
	            System.out.println("yes");	
	        }
		public static void main(String args[]) {
			increasingNumber oj=new increasingNumber();
			oj.checkNumber();
	}
}

