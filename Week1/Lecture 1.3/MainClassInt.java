class SpecificArrayInt {
	public int a[];
	SpecificArrayInt (int a[]) {
		this.a=a;
	}
	void printInt(){
		for (int x:a)
			System.out.println(x);
	}
	void reverseInt() {
		int j = a.length-1;
		for (int i=0; i<j; i++) {
			int temp;
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
		}
	}
}
class MainClassInt{
	public static void main(String[] args) {
	int a[] ={1,2,3,4,5};
	SpecificArrayInt obj = new SpecificArrayInt(a);
	obj.a=a;
	obj.printInt();
	obj.reverseInt();
	System.out.println("Reversed Array:");
	obj.printInt();
	}
}

