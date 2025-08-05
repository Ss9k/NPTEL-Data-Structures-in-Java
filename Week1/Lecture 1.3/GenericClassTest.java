class GenericClass<T>{
	// Two elements of generic type T is written below
	private T x;
	
	// Constructor
	public GenericClass(T t) {
		x = t;
	}
	// Print the T-type value for an object
	public void printData() {
		System.out.println(x);
	}
} // This completes the defination of a simple generic class GenericClass<T>

	class GenericClassTest{
		public static void main (String[]args) {
			//A data with member as string 
			GenericClass<String> a =new GenericClass<String> ("Java");
			a.printData();
			// A data with the member as Integer value	
			GenericClass<Integer> b =new GenericClass<Integer> (123);
			b.printData();
			// A data with the member as float value	
			GenericClass<Double> c =new GenericClass<Double> (3.123);
			c.printData();
			}
	}