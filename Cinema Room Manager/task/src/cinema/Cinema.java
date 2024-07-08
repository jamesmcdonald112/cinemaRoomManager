package cinema;

import java.util.Arrays;

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

        // Create seat layout, set the layout and Print the Cinema layout to the screen
        char[][] seatLayout = CinemaLayoutManager.createSeatLayout(rows, seatsPerRow);
        CinemaLayoutManager.setSeatLayout(seatLayout);
        OutputManager.printSeatLayout(CinemaLayoutManager.getSeatLayout());

        // Calculate total seats and set it.
        int totalSeats = rows * seatsPerRow;
        CinemaLayoutManager.setTotalSeats(totalSeats);

        // Get user to pick a seat to print the price of the ticket for that seat, and then book
        // the seat
        System.out.println("Enter a row number:");
        int rowNumber = Integer.parseInt(UserInputManager.readUserInput());
        System.out.println("Enter a seat number in that row:");
        int seatNumber = Integer.parseInt(UserInputManager.readUserInput());

        // Calculate the ticket price
        int ticketPrice = CalculationManager.calculateTicketPrice(rowNumber);
        OutputManager.printTicketPrice(ticketPrice);

        // Update the seating arrangement with a booking
        CinemaLayoutManager.bookSeat(rowNumber, seatNumber);
        OutputManager.printSeatLayout(seatLayout);

    }
}