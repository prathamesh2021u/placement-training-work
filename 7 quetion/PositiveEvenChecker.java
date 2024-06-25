import java.util.Scanner;

public class PositiveEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        if (isPositiveEven(number)) {
            System.out.println(number + " is a positive even number.");
        } else {
            System.out.println(number + " is not a positive even number.");
        }

        scanner.close();
    }

    public static boolean isPositiveEven(int number) {
        return number > 0 && number % 2 == 0;
}
}