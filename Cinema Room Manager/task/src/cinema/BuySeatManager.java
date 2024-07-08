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

        // Update the total tickets bought
        StatisticsManager.increasePurchasedTickets();

        // Update the current income from tickets
        StatisticsManager.increaseCurrentTicketIncome(ticketPrice);

    }

    /**
     * The user is prompted to enter a row and seat number and this is return as an int[].
     * @return The seat location as an int[]. arr[0] is the row number, arr[1] is the seat number
     */
    private static int[] buySeat() {
        // Get user to pick a seat to print the price of the ticket for that seat, and then book
        // the seat
        int[] seat = new int[2];

        boolean running = true;
        while (running) {
            System.out.println("Enter a row number:");
            int rowNumber = Integer.parseInt(UserInputManager.readUserInput());
            System.out.println("Enter a seat number in that row:");
            int seatNumber = Integer.parseInt(UserInputManager.readUserInput());
            if(!isValidSeat(rowNumber, seatNumber)) {
                System.out.println("Wrong input!");
            } else if (!isAvailableSeat(rowNumber, seatNumber)) {
                System.out.println("That ticket has already been purchased!");
            } else {
                seat[0] = rowNumber;
                seat[1] = seatNumber;
                running = false;
            }
        }
        return seat;
    }

    /**
     * Checks the seat is in the bounds of the cinema
     * @param row The row to be checked
     * @param seat The seat to be checked
     * @return True if it is a valid seat; false otherwise
     */
    private static boolean isValidSeat(int row, int seat) {
        int totalRows = CinemaLayoutManager.getRows();
        int seatsPerRow = CinemaLayoutManager.getSeatsPerRow();

        // Seat must be a positive number and must be in the bounds of the seatLayout
        return (row <= totalRows && row >= 1) && (seat <= seatsPerRow && seat >= 1);
    }

    /**
     * Checks if the seat is available
     * @param row the row to be checked
     * @param seat The seat to be checked
     * @return True if it is available; false otherwise
     */
    private static boolean isAvailableSeat(int row, int seat) {
        char[][] seatLayout = CinemaLayoutManager.getSeatLayout();
        return seatLayout[row-1][seat-1] == 'S'; // -1 for indexing
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
