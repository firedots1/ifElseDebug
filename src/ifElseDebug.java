import java.util.Scanner;

public class ifElseDebug {
    public static void main(String[] args) {
        int number = 10; // To declare that int number is 10.
        Scanner userInput = new Scanner(System.in); // This is to initialization to the Scanner;
        System.out.println("Enter a number to check:"); // This is the println for user input for giving number
        number = userInput.nextInt();
        if (number > 10) {
            System.out.println("Number is positive.");
        } else if (number < 10) {
            System.out.println("Number is not positive.");
        } else {
            System.out.println(" The Number is equal to 10, application finished.");
        }
    }
}