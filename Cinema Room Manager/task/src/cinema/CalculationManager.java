package cinema;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculationManager {

    /**
     * Calculates the total income from the ticket sales based on the total seats. Rates change
     * depending on where the seat is located.
     *
     * @return The total income from tickets as an int
     */
    public static int calculatePotentialIncomeFromTickets() {
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

    /**
     * Calculates the percentage of tickets purchased and rounds up to 2 decimal places. If there
     * are no tickets purchased, it returns 0
     * @return The percentage of tickets purchased as a double.
     */
    public static String calculatePurchasedTicketPercentage() {
        // If number of tickets purchased is 0, return 0.
        if (StatisticsManager.getPurchasedTickets() == 0) {
            return "0.00";
        }

        // Calculate percentage
        int totalSeats = CinemaLayoutManager.getTotalSeats();
        int totalSeatsPurchased = StatisticsManager.getPurchasedTickets();
        double percentage =  ((double) totalSeatsPurchased / totalSeats) * 100.00;

        // Round to two decimal places
        BigDecimal bd = new BigDecimal(Double.toString(percentage));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedValue = bd.doubleValue();

        // Ensure the result always has 2 decimal places
        String formattedMessage = String.format("%.2f", roundedValue);

        return formattedMessage;
    }
}
