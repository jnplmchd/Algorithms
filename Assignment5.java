
//The idea of the algorithm is to find the min and max of an array and input them into a new array
public class Assignment5 {
	
	//Recursive
public int[] minMax(int[] nums, int begin, int end) {
  	
  	int arr[] = new int[2]; 
	
	if (begin == end) {              //case if nums is of size 1
    arr[0] = nums[begin];
    arr[1] = nums[end];
    return arr;
  }
  else if (end - 1 == begin) {      //case if nums is of size 2
    if (nums[begin] < nums[end]) {
      arr[0] = nums[begin];
      arr[1] = nums[end];
    }
    else {
      arr[0] = nums[end];
      arr[1] = nums[begin];
    }
     return arr;
  }
  else {                           //case if nums is of size > 2
	  int mid = (end + begin)/2;
	  int arrLeft[] = minMax(nums, begin, mid);   //left side of nums until it has 2 values
	  int arrRight[] = minMax(nums, mid+1, end);  //right side of nums untl it has 2 values
    
	  //comparing the values of the pairs to find the min and max of the pairs and assign to new array
    if (arrRight[0] < arrLeft[0]) {
      arr[0] = arrRight[0];
    }
    else {
      arr[0] = arrLeft[0];
    }
    
    if (arrRight[1] > arrLeft[1]) {
      arr[0] = arrRight[1];
    }
    else {
      arr[1] = arrLeft[1];
    }
    return arr;
  }
}
		} 

