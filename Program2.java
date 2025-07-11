import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        int count = 0;
        int number = 1;

        while (count < a) {
            System.out.print(number);
            count++;
            number += 2;
            if (count < a) {
                System.out.print(", ");
            }
        }
    }
}
