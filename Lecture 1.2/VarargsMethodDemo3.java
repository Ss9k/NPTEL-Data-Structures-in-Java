////varargs method using objects
class VarargsMethodDemo3 {
	public static void varargsMethod3 (Object ... obj) {
		for (Object o : obj)
			System.out.print (" " + o);
		System.out.println ( );
	}
public static void main (String[] args) {
	varargsMethod3( 1, "String", 2.3, true); // Four arguments
	varargsMethod3 (); // No arguments
	varargsMethod3 (15, 25, 35, 45, 55); // Five arguments

}

}