import java.util.Arrays;
import java.util.Scanner;
public class SelectionSortHw {
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
        sSort(numbers);
        System.out.println("Descending order: " + Arrays.toString(numbers));
    }
    private static void sSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIdx =i;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] > numbers[minIdx])
                    minIdx = j;
            }
            if (minIdx != i) {
                int tempNumb = numbers[minIdx];
                numbers[minIdx] = numbers[i];
                numbers[i] = tempNumb;
            }
        }
    }
}