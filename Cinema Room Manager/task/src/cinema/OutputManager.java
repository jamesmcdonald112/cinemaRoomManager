package cinema;

public class OutputManager {

    /**
     * Prints the income to the screen with a dollar sign
     * @param amount
     */
    public static void printTotalIncome(int amount) {
        System.out.println("Total income: $" + amount);
    }

    /**
     * This prints the current state of the seating arrangement.
     * @param seatLayout The seating arrangement to be printed
     */
    public static void printSeatLayout(char[][] seatLayout) {
        StringBuilder result = new StringBuilder();
        result.append("Cinema:\n");

        // Get the rows and seats per row variable
        int totalRows = seatLayout.length;
        int seatsPerRow = seatLayout[0].length;

        // Add numbers for the rows and the seats per row.
        for (int number = 0; number <= seatsPerRow; number++) {
            if (number == 0) {
                result.append(' ');
            } else {
                result.append(number);
            }
            result.append(' '); // Add a space
        }

        // Add a new line
        result.append('\n');

        for (int row = 0; row < totalRows; row++) {
            result.append(row + 1); // +1 to adjust for the 0 index
            result.append(' '); // Add a space
            for (int seat = 0; seat < seatsPerRow; seat++) {
                result.append(seatLayout[row][seat]);
                result.append(' '); // Add a space
            }
            result.append("\n");
        }

        System.out.println(result);
    }

    /**
     * Prints the amount for the ticket with a $ sign
     * @param amount
     */
    public static void printTicketPrice(int amount) {
        System.out.println("Ticket price: $" + amount);
        System.out.println(" "); // Extra space for formatiing
    }
}
