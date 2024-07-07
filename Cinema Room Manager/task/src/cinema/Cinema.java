package cinema;

public class Cinema {



    public static void main(String[] args) {
        // Get number of rows from the user and set it
        System.out.println("Enter the number of rows:");
        int rows = Integer.parseInt(UserInputManager.readUserInput());
        CinemaLayoutManager.setRows(rows);

        // Get the number of seatsPerRow in each row and set it
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = Integer.parseInt(UserInputManager.readUserInput());
        CinemaLayoutManager.setSeatsPerRow(seatsPerRow);

        // Calculate total seats and set it.
        int totalSeats = rows * seatsPerRow;
        CinemaLayoutManager.setTotalSeats(totalSeats);

        // Calculate total income and print to screen
        int totalIncomeFromTickets = CalculationManager.calculateIncomeFromTickets();
        OutputManager.printTotalIncome(totalIncomeFromTickets);

    }
}