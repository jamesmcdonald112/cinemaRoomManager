package cinema;

import java.util.Scanner;

public class UserInputManager {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Reads the input from the user.
     * @return The user's input as a string.
     */
    public static String readUserInput() {
        return scanner.nextLine();
    }
}
