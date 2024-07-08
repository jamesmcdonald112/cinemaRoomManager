package cinema;


public class Cinema {

    /**
     * Controls the logic of the program. The user is prompted to enter the number of rows and
     * seats per row. The layout for the cinema is created based on this. The menu is then opened
     * where the user is given options to interact with the cinmema layout.
     * @param args
     */
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

        // Calculate total seats and set it.
        int totalSeats = rows * seatsPerRow;
        CinemaLayoutManager.setTotalSeats(totalSeats);

        // Run menu with a loop
        while (MenuManager.isRunning()) {
            MenuManager.menuManager();
        }

    }
}