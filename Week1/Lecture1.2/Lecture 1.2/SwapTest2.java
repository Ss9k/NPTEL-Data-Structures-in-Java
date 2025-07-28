/*Generic method for Double swap operation*/
/*
*Generic method declaration missing
* Undeclared variable t
*No actual swap happens (Java is pass-by-value)
Deprecated constructor usage (since Java 9)
*/
/*class SwapTest2{
	public static <T> void swap (T x, T y) {
		T temp;
		temp = x;
		x = y;
		y = temp;
	}
	public static void main (String args []) {
		Double x = 99.0;
		Double y = 66.0;
		System.out.println("x=" +x + "y="+y);
		swap (x, y) ;
		System. out.println ("x=" +x + "y="+y);

	}
}*/

/*
*/
//corrected code
class SwapTest2 {
    public static <T> void swap(T x, T y) {
        T temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        Double x = 99.0;
        Double y = 66.0;
        System.out.println("x = " + x + " y = " + y);
        swap(x, y);
        System.out.println("x = " + x + " y = " + y);
    }
}

