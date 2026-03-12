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
                    .toArray();
        } catch (NumberFormatException e) {
            System.err.println("ERROR: Please enter valid integers only.");
        } catch (Exception e) {
            System.out.println("NOTICE: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}