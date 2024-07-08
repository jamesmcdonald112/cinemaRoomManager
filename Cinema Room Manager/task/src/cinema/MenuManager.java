package cinema;

public class MenuManager {
    // INSTANCE VARIABLES
    private static boolean running = true;

    // GETTERS AND SETTERS


    public static boolean isRunning() {
        return running;
    }

    public static void setRunning(boolean running) {
        MenuManager.running = running;
    }

    /**
     * This is the logic for the menu. It displays a list of menu items with numbers and the user
     * is asked to select an option. The user can view the seats, buy a seat or exit.
     */
    public static void menuManager() {
        System.out.println("""
                1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit""");
        int userChoice = Integer.parseInt(UserInputManager.readUserInput());

        switch (userChoice) {
            // Show the seats
            case 1 -> OutputManager.printSeatLayout(CinemaLayoutManager.getSeatLayout());
            // Buy a ticket
            case 2 ->  BuySeatManager.buySeatManager();
                // Exit
            case 3 -> StatisticsManager.showStatistics();
            case 0 -> setRunning(false);
            default -> System.out.println("Please enter a value between 1-3");
        }
    }


}
