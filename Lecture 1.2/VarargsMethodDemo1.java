// varargs method using array
class VarargsMethodDemo1 {
	static void varargsMethod1 (int v[]){
		System. out.print ("Number of args: " + v.length +" Elements: ");
		for (int x : v)
		System.out.print (x + " ");
		System.out.println ();
}
public static void main(String args[]) {
// Following arrays are created for test ...
	int x[] = { 1, 3, 5, 7 } ;
	int y[] = { 2, 4};
	int z[] = { };
	varargsMethod1 (x) ; // Passed 4 values to the method
	varargsMethod1(y) ; // Passed 2 values to the method
	varargsMethod1(z) ; // Passed no argument to the method
}
}
