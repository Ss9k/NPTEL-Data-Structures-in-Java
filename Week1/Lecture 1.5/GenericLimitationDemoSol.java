// Example: Generic class with wildcard argument
//solution: Solution of the limitation with wildcard
class Student<T extends Number> {
	String name;
	T[] marks;
	
	Student(T[] m) {
		marks = m;
	}
	double total() {
		double sum = 0.0;
		for(int i=0; i<marks.length; i++)
			sum+=marks[i].doubleValue();
		return (sum);	
	}
	boolean compareMarks(Student<?> others) {
			if (total() == others.total()) {
				return true;
			}else {
				return false;
			}
		}
}
class GenericLimitationDemo {
	public static void main (String args[]) {
		Integer intMarks1[] = { 44, 55, 33, 66, 77 };	// Marks stored in integer for s1
		Student<Integer> s1IntMarks = new Student<Integer>(intMarks1);
		System. out.println ("Total marks " + s1IntMarks.total() ) ;
		
		Integer intMarks2[] = { 49, 39, 53, 69 };	// Marks stored in integer for s2
		Student<Integer> s2IntMarks = new Student<Integer>(intMarks2);
		System. out.println ("Total marks " + s2IntMarks.total());
	
		// Compare marks between s1 and s2
		if (s1IntMarks.compareMarks (s2IntMarks))
			System.out.println ("Same marks");
		else
			System.out.println("Different marks.");
		
		Double doubleMarks[] = { 43.5, 55.5, 32.5, 66.5, 77.0 };	// Marks stored in double for s3
		Student<Double> s3DoubleMarks = new Student<Double>(doubleMarks);
		System.out.println("Total marks " + s3DoubleMarks.total() ) ;
	
		Float floatMarks[] = { 50.0F, 40.0F, 60.0F, 65.0F }; 	// Marks stored in float for s4
		Student<Float> s4FloatMarks = new Student<Float>(floatMarks);
		System.out.println("Total marks " + s4FloatMarks.total() ) ;
	
		// Compare marks between s2 and s3
		if (s2IntMarks.compareMarks (s3DoubleMarks))	// error !
			System.out.println("Same marks") ;
		else
			System.out.println("Different marks.");
		
		// Compare marks between s3 and s4
		if (s3DoubleMarks.compareMarks (s4FloatMarks))   // error!!
			System.out.println("Same marks");
		else
			System.out.println("Different marks.");
		}
	}

