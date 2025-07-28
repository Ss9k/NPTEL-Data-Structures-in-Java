/*Generic method for String swap operation*/
/*
 * This version of the swap method actually works in Java by using a Wrapper class.
 * 
 * Since Java passes objects by value (copy of reference), directly swapping two object references
 * in a method does not affect the original variables.
 * 
 * By wrapping the values in mutable Wrapper objects, we can swap their internal values and see the change reflected outside the method.
 */
/*class SwapTest3{
	public static <T> void swap (T x, T y) {
		T temp;
		temp = x;
		x = y;
		y = temp;
}

	public static void main (String args []) {
		String x = "99";
		String y = "66";
		System.out.println ("x = " + x+ "y="+ y);
		swap (x, y) ;
		System.out.println ("x = " + x+ "y="+ y);
	}
}*/
/*

*/
class Box<T> {
    T value;
    Box(T value) { this.value = value; }
}
class SwapTest3 {
    public static <T> void swap(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("Inside swap: x = " + x + ", y = " + y);
    }

    public static void main(String args[]) {
        String x = "99";
        String y = "66";
        System.out.println("Before swap: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
	}
