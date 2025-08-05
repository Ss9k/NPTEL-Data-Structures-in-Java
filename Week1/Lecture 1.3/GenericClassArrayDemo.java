// Generic class to handle array of any data type
class GenericArray<T> {
    T[] a;

    // Constructor
    GenericArray(T[] x) {
        a = x;
    }

    // To return i-th element of the array
    T getData(int i) {
        return a[i];
    }

    // Method to return length of the array
    int length() {
        return a.length;
    }

    // Method to reverse the array
    void reverseArray() {
        int j = a.length - 1;
        for (int i = 0; i < j; i++, j--) {
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    // Static generic method to print elements of any GenericArray<T>
    static <T> void printData(GenericArray<T> b) {
        for (int i = 0; i < b.length(); i++) {
            System.out.print(b.getData(i)+ " ");
        }
        System.out.println();
    }
}

public class GenericClassArrayDemo {
    public static void main(String[] args) {
        // Integer array
        Integer[] x = {1, 2, 3, 4, 5, 6};
        GenericArray<Integer> aInt = new GenericArray<Integer>(x);

        GenericArray.printData(aInt);
        aInt.reverseArray();
        GenericArray.printData(aInt);

        // String array
        String[] y = {"A", "B", "C", "D", "E"};
        GenericArray<String> bString = new GenericArray<String>(y);

        GenericArray.printData(bString);
        bString.reverseArray();
        GenericArray.printData(bString);

        // Double array
        Double[] z = {1.2, 2.3, 3.4, 4.5, 5.6};
        GenericArray<Double> cDouble = new GenericArray<Double>(z);

        GenericArray.printData(cDouble);
        cDouble.reverseArray();
        GenericArray.printData(cDouble);
    }
}
