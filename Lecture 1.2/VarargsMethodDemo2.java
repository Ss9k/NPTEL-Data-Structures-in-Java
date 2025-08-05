//varargs method using ellipsis
class VarargsMethodDemo2 {
//Defining a varargs method using ellipsis
	static void varargsMethod2 (int ... v) {
		System.out.println ("Number of arguments: "+ v.length) ;
		for (int i: v) // For each item i in array v
		System.out.print (i +" ");
		System.out.println();
}

	public static void main (String args []){
		// Calling the varargs method with variable arguments
		
		varargsMethod2 (1, -2, 3, -4); // Four parameters

		varargsMethod2 (9); // One parameter

		varargsMethod2 (); // no parameter
	}
}