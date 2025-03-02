import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        int number = getInput();
        checkEvenOdd(number);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}