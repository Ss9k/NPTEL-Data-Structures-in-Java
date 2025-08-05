//Example: Generic class with two parameters
class GC2<T1, T2> {
	T1 obj1;	//An object of type T1
	T2 obj2;	//An object of type T2
	
	GC2(T1 obj1, T2 obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2; 
	}
	public void print(){		// A local method in GC2
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
class GC2Test {
	public static void main (String[] args) {
		GC2<String, Integer> obj1 = new GC2<>("generic class",9);
		obj1.print();
		System.out.println("\n");
		GC2<Integer, Double> obj2 = new GC2<>(2,2.3);
		obj2.print();
	}
}