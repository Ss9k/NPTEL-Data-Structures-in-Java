class SpecificArrayDouble {
	//Declaring an array of double values
	double b[];
	SpecificArrayDouble (double b[]) {
		this.b=b;
	}
	// Method to print the array elements
	void printDouble() {
		for (double x : b) {
			System.out.println(x);
		}
	}
	//Method to reverse the array elements
	void reverseDouble() {
		int j=b.length-1;
		for (int i=0; i<=j; i++) {
			double temp;
			temp = b[i];
			b[i] = b[j];
			b[j]=temp;
			j--;
		}
	}
}
class MainClassDouble {
    public static void main(String[] args) {
        double b[] = {1.2, 1.3, 1.4, 1.5, 1.6};
        SpecificArrayDouble obj = new SpecificArrayDouble(b);

        System.out.println("Original Array:");
        obj.printDouble();
        obj.reverseDouble();
        System.out.println("Reversed Array:");
        obj.printDouble();
    }
}