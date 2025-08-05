// Example: Upper bound of argument in geenric class defination
class GenericBound<T extends Number> {
	T[] array;	// an array of type T

	// pass the constructor a reference of an array of type T.
	GenericBound(T[] t){
		array = t;
	}
	double average() {
		double sum = 0.0;
		for (int i =0; i<array.length; i++)
			sum += array[i].doubleValue();
		return sum /array.length;
	}
}	
class GenericBoundDemo {
	public static void main (String[] args) {
		Integer intArray[] = {1,2,3,4,5};
		GenericBound<Integer> intData = new GenericBound <Integer>(intArray);
		
		double avgInt = intData.average();
		System.out.println("Average is:" + avgInt);
		
		Double doubleArray[]={1.1, 1.2, 1.3, 1.4, 1.5};
		GenericBound <Double> doubleData = new GenericBound <Double> (doubleArray);
		
		double avgDouble  = doubleData.average();
		System.out.println("Average is:"+ avgDouble);
		
		/*String strArray[] = {"1", "2", "3", "4", "5"};	// errorz
		GenericBound <String> strData = new GenericBound <String>(strArray);*/
	}
}