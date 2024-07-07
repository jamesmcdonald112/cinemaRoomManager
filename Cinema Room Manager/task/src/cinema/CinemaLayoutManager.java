package cinema;

public class CinemaLayoutManager {
    // INSTANCE VARIABLES
    private static int rows;
    private static int seatsPerRow;
    private static int totalSeats;

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
}
