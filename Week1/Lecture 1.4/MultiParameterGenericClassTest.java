// Another generic class with two parameters
class PairData<T, V> {
	// Two fields of geenric type T and V
	private T x;
	private V y;
	
	public PairData(T a, V b) {
		x = a;
		y = b;
	}
	// Get the T-type value for a pair-data
	public T getTvalue() {
		return x;
	}
	public V getVvalue() {
		return y;
	}
	// To print the data member in an object
	public void printData() {
		System.out.print(getTvalue() + " , " + getVvalue());
	}
} //This completes the definition of the class PairData<T, V>

// The driver class program is below
class MultiParameterGenericClassTest {
	public static void main (String[]args) {
		// a pair data with both member as string
		PairData<String, String> a = new PairData<String, String> ("Java", "Python");
		a.printData();
		System.out.print("\n");
		
		// a pair data with first member as Integer and second as String
		PairData<Integer, String> b = new PairData<Integer, String> (121, "Python");
		b.printData();
		System.out.print("\n");
		
		// a pair data with first member as String and second as Integer
		PairData<String, Integer> c = new PairData<String, Integer> ("Java",121);
		c.printData();
		System.out.print("\n");
		
		// a pair data with first member as Integer and second as Double
		PairData<Integer, Double> d = new PairData<Integer, Double> (121, 121.12);
		d.printData();
		System.out.print("\n");
	}
	
}