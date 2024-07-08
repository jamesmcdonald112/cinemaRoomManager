# Cinema Ticket Booking System
This project simulates a cinema ticket booking system where users can choose seats, purchase tickets, and view statistics related to the cinema's occupancy and income.

## Features
- Show Seats: Display the current seating layout.
- Buy Ticket: Purchase a ticket for a specific seat.
- Statistics: Show the number of tickets purchased, percentage of seats booked, current income, and potential total income.

## To Run
```bash
cd cinemaRoomManager-main/Cinema\ Room\ Manager/task/src
javac cinema/*.java
java cinema.Cinema
```

## Main Menu:
Choose an option:
1. Show the seats: View the current seat layout.
2. Buy a ticket: Purchase a ticket by selecting a row and seat.
3. Statistics: View the statistics for the cinema.
0. Exit: Exit the program.

## Classes and Responsibilities
- Cinema: Main class to run the program and initialise the cinema layout.
- CinemaLayoutManager: Manages the cinema layout and seat arrangement.
- BuySeatManager: Handles the logic for purchasing a seat.
- CalculationManager: Calculates ticket prices, potential income, and purchased ticket percentage.
- MenuManager: Manages the main menu and user interactions.
- OutputManager: Prints various outputs to the console.
- StatisticsManager: Keeps track of purchased tickets and income and shows statistics.
- UserInputManager: Reads user input from the console.

## Conclusion
The project went smoothly without too many issues. However, one area for improvement is spending more time on planning, 
which is the same conclusion I have come to after the last few projects. Jumping straight into implementation often led to 
changes in approach, which could have been avoided with more thorough initial planning. 
In future projects, dedicating even more time to planning should streamline the development process and 
reduce the need for adjustments later on.
