import java.util.Scanner;
public class MinMaxHw {
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
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}