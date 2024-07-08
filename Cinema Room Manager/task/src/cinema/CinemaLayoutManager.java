package cinema;

public class CinemaLayoutManager {
    // INSTANCE VARIABLES
    private static int rows;
    private static int seatsPerRow;
    private static int totalSeats;
    private static char[][] seatLayout;

    // GETTERS AND SETTERS

    public static int getRows() {
        return rows;
    }

    public static void setRows(int rows) {
        CinemaLayoutManager.rows = rows;
    }

    public static int getSeatsPerRow() {
        return seatsPerRow;
    }

    public static void setSeatsPerRow(int seatsPerRow) {
        CinemaLayoutManager.seatsPerRow = seatsPerRow;
    }

    public static int getTotalSeats() {
        return totalSeats;
    }

    public static void setTotalSeats(int totalSeats) {
        CinemaLayoutManager.totalSeats = totalSeats;
    }

    public static char[][] getSeatLayout() {
        return seatLayout;
    }

    public static void setSeatLayout(char[][] seatLayout) {
        CinemaLayoutManager.seatLayout = seatLayout;
    }

    /**
     * Creates the seating layout of the cinema based on the total rows and seats per row.
     *
     * @param totalRows   The total rows in the seating layout
     * @param seatsPerRow The number of seats per row
     * @return The seating layout as a char[][] fill with the character 'S'
     */
    public static char[][] createSeatLayout(int totalRows, int seatsPerRow) {
        char[][] seatLayout = new char[totalRows][seatsPerRow];
        for (int row = 0; row < totalRows; row++) {
            for (int seat = 0; seat < seatsPerRow; seat++) {
                seatLayout[row][seat] = 'S';
            }
        }
        return seatLayout;
    }

    /**
     * Checks to seat is the person is seated in the first of second half of the cinema
     * @param row The row the person is in
     * @return True if it is the first half; false otherwise
     */
    public static boolean isFirstHalf(int row) {
        int firstHalf = rows / 2;
        return row <= firstHalf;
    }


}
