//The idea of this algorithhm is to find base^n using th binary representation of the exponent.
public class Power3 {

	public int powerN(int base, int n) {
	int result = 1;               //the result
		  
	int binary = 0;               //the binary representation of each bit of n
	if(n == 0) {
         return 1;
	}
	  
	while(n>0){         
	   binary = n%2;              //is the bit of n 0 or 1?   from right to left
         if (binary == 1) {
            result = result *base;  //when bit is 1: result is multiplied by the base
	  }
	  n = n/2;                   //move on to the next bit
	  base = base * base;        //base is squared on every step of the loop
      }
     return result;
}

}
