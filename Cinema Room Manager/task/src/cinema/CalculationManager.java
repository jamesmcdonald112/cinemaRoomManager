package cinema;

public class CalculationManager {

    /**
     * Calculates the total income from the ticket sales based on the total seats. Rates change
     * depending on where the seat is located.
     *
     * @return The total income from tickets as an int
     */
    public static int calculateIncomeFromTickets() {
        // Small screen rooms are set at $60
        int totalSeats = CinemaLayoutManager.getTotalSeats();
        if (totalSeats <= 60) {
            return totalSeats * 10;
        } else {
            // Larger rooms are split in half. For odd numbers, the back half is bigger
            // Get the total rows and split them in haf
            int totalRows = CinemaLayoutManager.getRows();
            int firstHalfAmount = totalRows / 2;
            int secondHalfAmount = totalRows - firstHalfAmount;

            // Calculate the cost for each half and sum them
            int seatsPerRow = CinemaLayoutManager.getSeatsPerRow();
            int firstHalfIncome = firstHalfAmount * 10 * seatsPerRow;
            int secondHalfIncome = secondHalfAmount * 8 * seatsPerRow;
            return firstHalfIncome + secondHalfIncome;
        }
    }

    /**
     * Calculates the cost of the ticket based on the seat location
     * @param row The row of the seat
     * @return The price of the ticket as an int.
     */
    public static int calculateTicketPrice(int row) {
        // Small screen rooms are set at $60
        int totalSeats = CinemaLayoutManager.getTotalSeats();
        if (totalSeats <= 60) {
            return 10;
        } else {
            // if it is in the first half, charge 10, otherwise 8
            int cost = (CinemaLayoutManager.isFirstHalf(row)) ? 10 : 8;
            return cost;
        }
    }
}
