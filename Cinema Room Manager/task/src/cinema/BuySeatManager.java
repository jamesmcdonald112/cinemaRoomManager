package cinema;

public class BuySeatManager {
    // INSTANCE VARIABLES
    private static int row;
    private static int seat;

    // GETTERS AND SETTERS
    public static int getRow() {
        return row;
    }

    public static void setRow(int row) {
        BuySeatManager.row = row;
    }

    public static int getSeat() {
        return seat;
    }

    public static void setSeat(int seat) {
        BuySeatManager.seat = seat;
    }

    /**
     * Handles the logic of buying a seat. The user chooses a seat, the seat is set, the price is
     * calculated and printed for the user and the seating arrangement is updated.
     */
    public static void buySeatManager() {
        // Get the users seat choice
        int[] seatLocation = buySeat();

        // Set the seat
        setRow(seatLocation[0]);
        setSeat(seatLocation[1]);

        // Print the ticket cost for the user
        // Calculate the ticket price
        int ticketPrice = CalculationManager.calculateTicketPrice(BuySeatManager.getRow());
        OutputManager.printTicketPrice(ticketPrice);

        // Book the seat
        BuySeatManager.bookSeat(row, seat);

    }

    /**
     * The user is prompted to enter a row and seat number and this is return as an int[].
     * @return The seat location as an int[]. arr[0] is the row number, arr[1] is the seat number
     */
    private static int[] buySeat() {
        // Get user to pick a seat to print the price of the ticket for that seat, and then book
        // the seat
        int[] seat = new int[2];
        System.out.println("Enter a row number:");
        int rowNumber = Integer.parseInt(UserInputManager.readUserInput());
        System.out.println("Enter a seat number in that row:");
        int seatNumber = Integer.parseInt(UserInputManager.readUserInput());

        seat[0] = rowNumber;
        seat[1] = seatNumber;

        return seat;

    }

    /**
     * The seat is marked as booked in the seating arrangement using the character 'B'
     * @param row the row to be booked
     * @param seat The seat to be booked
     */
    private static void bookSeat(int row, int seat) {
        // go to the row and the seat and book the seat for the user. - 1 for indexing
        char[][] seatLayout = CinemaLayoutManager.getSeatLayout();
        seatLayout[row - 1][seat - 1] = 'B';
    }
}
