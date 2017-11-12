public class MinMax {

	/**
	 * method prints out minimum and maximum value of Array 
	 * implementation is optimal in terms of number of key comparisons
	 * @param A
	 */
	public static void printMinMax(int[] A) {

		int minimum = Integer.MAX_VALUE;
		int maximum = 0;

		// TODO
		
		
		// print out result 
		System.out.print("Array A( ");
		for (int i : A) {
			System.out.print(i + " ");
		}
		System.out.println(") hat folgendes Minimum und Maximum:");
		System.out.println("Minimum: " + minimum);
		System.out.println("Maximum: " + maximum);
		
				
	}
	
	
		
	public static void main(String[] args) {
		int[] a = {1, 4, 2, 5, 9, 3, 8}; 
		printMinMax(a);
	}


	
	
}
