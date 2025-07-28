/* Example 1
A generic method for printing
*/
class Demo {
	// Defining a generic method to print any data type
	<T> void genericPrint(T t) {
		System.out.println (t);
	}
	public static void main(String args[]) {
		Demo demo = new Demo();
		demo.genericPrint(101);
		demo.genericPrint(10.3654);
		demo.genericPrint("This is a string");
	}
}
