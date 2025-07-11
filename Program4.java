import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> result = new TreeMap<>();

        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        for (int number : input) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        System.out.println(result);
    }
}
