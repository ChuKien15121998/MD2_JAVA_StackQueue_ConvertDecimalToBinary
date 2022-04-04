import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<String> stackRemainder = new Stack<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        while (num > 0) {
            int remainder = num % 2;
            System.out.print(remainder);
            stackRemainder.push(remainder + "");
            num = num / 2;
        }
        System.out.println("\nBinary is: ");
        int size = stackRemainder.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stackRemainder.pop());
        }
    }
}
