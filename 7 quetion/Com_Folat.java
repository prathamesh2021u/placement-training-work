import java.util.Scanner;

public class Com_Folat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input floating-point another number: ");
        double num2 = scanner.nextDouble();

        if (areSameUptoThreeDecimalPlaces(num1, num2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }

        scanner.close();
    }

    public static boolean areSameUptoThreeDecimalPlaces(double num1, double num2) {
        int intNum1 = (int)(num1 * 1000);
        int intNum2 = (int)(num2 * 1000);

        return intNum1 == intNum2;
}
}