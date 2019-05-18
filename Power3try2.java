
public class Power3try2 {


	public static int powerN(int base, int n) {
		  int temp = 0;
		  int count = 0;
		  if(n == 0) {
			  System.out.println("Count of mult: " + count);
			  
		    return 1;
		  }
		  temp = powerN(base, n/2);
		  
		  if(n%2 == 0) {
			  count = count +1;
			  System.out.println("Count of mult: " + count);
			  
		    return temp*temp;
		  }
		  else {
		    if(n > 0) {
		    	count = count + 2;
		    	 System.out.println("Count of mult: " + count);
				  
		      return base * temp * temp;
		    }
		    else{
		    	count = count + 1;
		    	 System.out.println("Count of mult: " + count);
				  
		      return(temp*temp)/base;
		    }
		  }
		  		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(powerN(3, 10));
	}
}
