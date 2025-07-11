import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i += 2) {
            System.out.print(i);
            if (i + 2 <= a) {
                System.out.print(", ");
            }
        }
    }
}
