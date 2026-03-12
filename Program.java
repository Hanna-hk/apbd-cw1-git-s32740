import java.util.Scanner;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Java Statistics Program ---");

        try {
            System.out.println("Enter numbers separated by spaces (e.g., 10 20 30):");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                throw new Exception("No data entered!");
            }

            int[] numbers = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();
            // Menu wyboru
            System.out.println("\nWhat do you want to calculate?");
            System.out.println("1. Average");
            System.out.println("2. Maximum");
            System.out.println("3. Minimum");
            System.out.print("Choose (1-3): ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> System.out.printf("Avg: %.2f%n", Program.calculateAverage(numbers));
                case 2 -> System.out.println("Max: " + Program.findMax(numbers));
                case 3 -> System.out.println("Min: " + Program.findMin(numbers));
                default -> System.out.println("Error!");
            }

        } catch (NumberFormatException e) {
            System.err.println("ERROR: Please enter valid integers only.");
        } catch (Exception e) {
            System.out.println("NOTICE: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0.0;

        long sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int max = numbers[0]; // Zakładamy, że pierwszy element jest największy
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static int findMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int min = numbers[0];
        for (int num : numbers) {
            min = Math.min(min, num);
        }
        return min;
    }
}