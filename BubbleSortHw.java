import java.util.Scanner;
import java.util.Arrays;
public class BubbleSortHw {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter five numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();
        int numbers[] = {num1, num2, num3, num4, num5};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Descending order: " + Arrays.toString(numbers));
    }
    private static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j+1] ) {
                    int tempNumb = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tempNumb;
                }
            }
        }
    }
}