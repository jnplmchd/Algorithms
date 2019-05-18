
public class Power3 {

	public static int powerN(int base, int n) {
		  int binary = 1;
		  //int count = 0;
		  while(n>0){
		    if (n%2 != 0) {
		    binary = binary *base;
		    //count = count + 1;
		   // System.out.println("Count of mult: " + count);
			
		    }
		    n = n/2;
		    base = base * base;
		    //count = count + 1;
		   // System.out.println("Count of mult: " + count);
			
		  }
		  //System.out.println("Count of mult: " + count);
		  return binary;
				}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(powerN(3, 1));
	}

}
