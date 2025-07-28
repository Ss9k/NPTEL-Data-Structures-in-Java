/* Ststic generic method*/
class StaticGenericMethodDemo {
	// Defining a static generic method to print any data type
	static <T> void genericPrint(T t) {
		//The following statement print which type parameter T this method is handling
		System.out.println(t.getClass().getName() + ":" + t);
	}
	public static void main (String[] args) {
		genericPrint(101);
		genericPrint(10.3265);
		genericPrint("This is a string");
	}
}