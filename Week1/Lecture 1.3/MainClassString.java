class SpecificArrayString {
	//Declaring an array of String values
	String c[];
	SpecificArrayString (String c[]) {
		this.c=c;
	}
	// Method to print the array elements
	void printString() {
		for (String x : c) {
			System.out.println(x);
		}
	}
	//Method to reverse the array elements
	void reverseString() {
		int j=c.length-1;
		for (int i=0; i<=j; i++) {
			String temp;
			temp = c[i];
			c[i] = c[j];
			c[j]=temp;
			j--;
		}
	}
}
class MainClassString {
    public static void main(String[] args) {
        //String c[] = {"A", "B", "C", "D", "E"};
		String c[] = {"1", "2", "3", "4", "5"};
        SpecificArrayString obj = new SpecificArrayString(c);

        System.out.println("Original Array:");
        obj.printString();
        obj.reverseString();
        System.out.println("Reversed Array:");
        obj.printString();
    }
}