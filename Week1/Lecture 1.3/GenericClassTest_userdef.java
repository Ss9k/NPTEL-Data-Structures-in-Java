//Define a class Student
class Student {
	String name;
	float marks;

	Student (String name, float marks) {
	this.name = name;
	this.marks = marks;
	}

class GenericClass<T> {
	T obj;
	GenericClass (T obj) {
		this.obj = obj;
	}
	public T getObject (){
		return this.obj;
	}
}
}
class GenericClassTest_userdef {	// Driver class to test generic class facility
	public static void main (String[] args) {
		GenericClass <Integer> iObj = new GenericClass <Integer>(15);
		// A class with Integer type
		System.out.println (iObj.getObject());
		
		GenericClass <String> sObj = new GenericClass <String>("Java");
		// Another class with String type
		System.out.println(sObj.getObject());
		
		Student s = new Student("Shriyanshu", 99.9f);
		GenericClass <Student> tObj = new GenericClass <Student>(s);
		// Another class with Student type
		System.out.println(tObj.getObject().name + " - " + tObj.getObject().marks);
	}	
}