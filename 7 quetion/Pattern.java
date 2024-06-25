import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Pattern 1:");
        pattern1(rows);

        System.out.println("\nPattern 2 (Floyd's Triangle):");
        pattern2(rows);

        System.out.println("\nPattern 3:");
        pattern3(rows);
    }

    private static void pattern1(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void pattern2(int rows) {
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    private static void pattern3(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
}
}
}