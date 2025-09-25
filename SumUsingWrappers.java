import java.util.ArrayList;
import java.util.Scanner;

public class SumUsingWrappers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (comma separated): ");
        String input = sc.nextLine();
        String[] parts = input.split(",");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            int num = Integer.parseInt(part.trim());
            numbers.add(num);
        }
        int sum = 0;
        for (Integer n : numbers) {
            sum += n;
        }
        System.out.println("Sum of numbers = " + sum);
        sc.close();
    }
}
