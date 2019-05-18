
public class Median {
//always an odd number of elements
//elements can have duplicates
	public static int median(int[] nums) {
	
		int less = 0;
		int more = 0;
	      
		for (int i = 0; i<= nums.length-1; i++) {
			less = 0;
			more = 0;
			//System.out.println(nums[i] + "'s turn");
		    for (int j = 0; j <= nums.length-1; j++){		       		      
		       if (nums[i] <= nums[j] && i != j) {
		         less = less + 1;
		         //System.out.println(nums[i] + " is less than " + nums[j] + " less count: " + less);				  
		       }
		       if (nums[i] >= nums[j] && i != j) {
			         more = more + 1;
			         //System.out.println(nums[i] + " is more than " + nums[j] + " more count: " + more);				  
			       }
		       if  (less >= nums.length/2 && more >= nums.length/2) {
			         return nums[i];
			       }
		        }
		  
		  }
		return 0;
		}
	
	public static void main(String[] args) {
		int arr[] = { -2, 5, 6, 5, 4, 4, 4};
		System.out.println(median(arr) + " is the median");	
		

	}

}
