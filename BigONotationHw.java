public class BigONotationHw {
    public static void main(String[] args) {
        double[] values = {
                10,
                Math.log10(10),
                Math.pow(10, 2),
                factorial(10)
        };
        bubbleSort(values);
        System.out.println("Sorted values in ascending order:");
        for(double value : values) {
            System.out.println(value);
        }
    }
    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    public static double factorial(int num) {
        double result = 1;
        for (int i = 1; i < num; i++) {
            result *= i;
        }
        return result;
    }
}