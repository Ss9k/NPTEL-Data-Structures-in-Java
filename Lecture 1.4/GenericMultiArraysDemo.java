/*//Define the user defined Student class
class Student {
	String name;    // Name of the Students
	int[] marks = new int[3];	//Stores the marks of three subjects
	
	//Constructor for the class Student
	Student(String s, int m[]) {
		name = s;
		marks = m;
	}
	//Defining a method to print student's records
	void pritnStudent() {
		System.out.println("Name:"+name);
		System.out.println("Scores:"+marks[0]+" "+marks[1]+" "+marks[2]);
	}
}
 //End of class Student

//Defining a generic array of two type parameters
class GenericMultiArrays<T, S> {
	// Declaring an array with two type parameters
	T a[];
	S b[];
	GenericMultiArrays(T x, S y) {
		a = x;
		b = y;
	}
	T getTData(int i) { 	//to return element stored in i-th place in the array
		return a[i];
	}
	
	S getSData(int i) { 	//to return element stored in i-th place in the array
		return b[i];
	}
	
	// Overload methods in the geenric class
	void printData(T t){
		for(int i=0; i<t.length(); i++){
			System.out.print(t.getData(i)+" ");	//print the i-th element in t
		System.out.println(); //print a new line
		}
	}
	void printData(S s) {
		for (int i = 0; i< s.length(); i++) {
			s[i].printStudent();	//print the i-th student in s		
		System.out.println();	// print a new line
		}
	}
	//Few additional methods
	void reverseArray(T t) {
		int front = 0, rear = t.length-1; T temp;
		while (front < rear) {
			temp = t[rear];
			t[rear] = t[front];
			t[front] = temp;
			front++; rear--;
		}
	}
	void reverseArray(S s) {
	int front = 0, rear = t.length-1; S temp;
	while (front < rear) {
		temp = s[rear];
		s[rear] = s[front];
		s[front] = temp;
		front++; rear--;
	}
	}	
}		// End of the defination of class GenericMultiArrays

// Driver class is programmed below
class GenericMultiArraysDemo {
	public static void main (Stirng args[]) {
		//Creating an array of String data
		String t[ ] = {"A", "B", "C"} ;		//It is an array of String data
		//Creating an array of Students' data
		Student s[] = new Student[3];
		s [0] = new Student ("Ram", 86, 66, 96);
		s [1] = new Student ("Rahim", 88, 99, 77) ;
		s [2] = new Student ("John", 75, 85, 95);

		// Store the data into generic arrays
		GenericArrays<String, Student> arrayData = new GenericArrays<String,Student>(t, s);
		// Printing the data
		arrayData.printData (t) ;

		//Reverse ordering of data
		arrayData.reverseArray(t) ;
		
		// Printing the data
		arrayData.printData(s);
		
		//Reverse ordering of data
		arrayData. reverseArray (s) ;
		
		// Printing the data after reverse ordering...
		
		arrayData.printData (t);	// Printing the array of strings
		
		arrayData.printData(s);		// Printing the array of students

	}
}*/

// Define the user-defined Student class
class Student {
	String name;    
	int[] marks;	// Stores the marks of three subjects
	
	// Constructor for the class Student
	Student(String s, int[] m) {
		name = s;
		marks = m;
	}

	// Defining a method to print student's records
	void printStudent() {
		System.out.println("Name: " + name);
		System.out.println("Scores: " + marks[0] + " " + marks[1] + " " + marks[2]);
	}
}

// Defining a generic array of two type parameters
class GenericMultiArrays<T, S> {
	T[] a;
	S[] b;

	GenericMultiArrays(T[] x, S[] y) {
		a = x;
		b = y;
	}

	T getTData(int i) {
		return a[i];
	}

	S getSData(int i) {
		return b[i];
	}

	void printTData(T[] t){
		for(int i = 0; i < t.length; i++){
			System.out.print(t[i] + " ");
		}
		System.out.println();
	}

	void printSData(S[] s) {
		for (int i = 0; i < s.length; i++) {
			// Cast to Student to call printStudent
			if (s[i] instanceof Student) {
				((Student) s[i]).printStudent();		
			}
			System.out.println();
		}
	}

	void reverseTArray(T[] t) {
		int front = 0, rear = t.length - 1;
		T temp;
		while (front < rear) {
			temp = t[rear];
			t[rear] = t[front];
			t[front] = temp;
			front++; rear--;
		}
	}

	void reverseSArray(S[] s) {
		int front = 0, rear = s.length - 1;
		S temp;
		while (front < rear) {
			temp = s[rear];
			s[rear] = s[front];
			s[front] = temp;
			front++; rear--;
		}
	}
}

// Driver class
class GenericMultiArraysDemo {
	public static void main(String[] args) {
		// Creating an array of String data
		String[] t = {"A", "B", "C"};

		// Creating an array of Student objects
		Student[] s = new Student[3];
		s[0] = new Student("Ram", new int[]{86, 66, 96});
		s[1] = new Student("Rahim", new int[]{88, 99, 77});
		s[2] = new Student("John", new int[]{75, 85, 95});

		// Store the data into generic arrays
		GenericMultiArrays<String, Student> arrayData = new GenericMultiArrays<>(t, s);

		// Printing the data
		arrayData.printTData(t);
		arrayData.printSData(s);

		// Reverse ordering of data
		arrayData.reverseTArray(t);
		arrayData.reverseSArray(s);

		// Printing the data after reverse ordering
		arrayData.printTData(t);
		arrayData.printSData(s);
	}
}
