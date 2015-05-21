import java.util.Arrays;

class LargeFind{
	static int[] myArray;

	LargeFind(int[] val){
		myArray = val;
	}

	Integer nthLargest(int n) throws IndexOutOfBoundsException{
		Arrays.sort(myArray);
		return myArray[myArray.length - n];
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,99,34,78,12,45,990,34,87,456,23422,7897};
		LargeFind arr1 = new LargeFind(nums);
		System.out.println(arr1.nthLargest(4));
	}
}


/*

Exercise 3
Create a class with: (1) a constructor that accepts an unordered array or vector 
of integers (your choice), and (2) a method nthLargest() that returns the 
nth largest integer from the original vector.  For example, with an input 
of { 5, 3, 9, 4, 3, 3, 8, 3, 3 }, nthLargest(1) should return 9, and 
nthLargest(4) should return 4.  For inputs of zero or greater than the
size of the input, nthLargest() should throw an exception.  The input
array will be very large (but you can make a copy), and the input to
nthLargest() may also be large, so a linear search algorithm is not 
acceptable.

Hint:  If you ask “may I sort the input”, the answer will be “yes, but there 
is a more efficient approach”.  If you ask for a hint regarding the more 
efficient approach, I’ll ask if it is necessary to fully sort the input 
to implement nthLargest().  If that doesn’t help, I’ll suggest you proceed 
with the sort-based approach, then explore other possibilities.


Link: http://www.cs.rit.edu/~ib/Classes/CS515_Spring12-13/Slides/022-SelectMasterThm.pdf

*/