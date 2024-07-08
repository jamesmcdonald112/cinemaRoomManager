package cinema;

public class OutputManager {

    public static void printTotalIncome(int amount) {
        System.out.println("Total income:");
        System.out.println("$" + amount);
    }

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

    public static void printTicketPrice(int amount) {
        System.out.println("Ticket price: $" + amount);
        System.out.println(" "); // Extra space for formatiing
    }
}
