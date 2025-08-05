/*Generic method for Integer swap operation*/
/*
 * This program demonstrates a common misconception when attempting to swap
 * two objects using a generic method in Java.
 * 
 * Java is strictly pass-by-value. When you pass objects to a method,
 * only the copy of the reference is passed. So swapping references inside
 * the method doesn't affect the original references.
 * 
 * To truly swap object values, use a wrapper class or manipulate fields directly.
 */

/*class SwapTest1{
	public static <T> void swap(T x, T y) {
		T temp;
		temp=x;
		x=y;
		y=temp;
	}
	public static void main(String[]args) {
	Integer x =99;
	Integer y = 66;
	System.out.println("x =" + x + "y=" + y);
	swap(x, y);
	System.out.println("x =" + x + "y =" + y);
	}
}*/
/*
 * This version of the swap method actually works in Java by using a Wrapper class.
 * 
 * Since Java passes objects by value (copy of reference), directly swapping two object references
 * in a method does not affect the original variables.
 * 
 * By wrapping the values in mutable Wrapper objects, we can swap their internal values and see the change reflected outside the method.
 */
 
// A wrapper class to hold a generic value.
// This allows us to manipulate the actual object content, not just the reference.
class Wrapper<T> {
    T value;

    // Constructor to initialize the wrapper with a value
    Wrapper(T value) {
        this.value = value;
    }
}

public class SwapTest1
 {

    // Generic method to swap values inside wrapper objects
    public static <T> void swap(Wrapper<T> x, Wrapper<T> y) {
        T temp = x.value;   // Store x's value in temp
        x.value = y.value;  // Assign y's value to x
        y.value = temp;     // Assign temp (original x) to y
    }

    public static void main(String[] args) {
        // Creating two Wrapper objects holding Integer values
        Wrapper<Integer> x = new Wrapper<>(99);
        Wrapper<Integer> y = new Wrapper<>(66);

        // Displaying values before swapping
        System.out.println("Before swap: x = " + x.value + ", y = " + y.value);

        // Performing the actual swap
        swap(x, y);

        // Displaying values after swapping
        System.out.println("After swap:  x = " + x.value + ", y = " + y.value);
    }
}

