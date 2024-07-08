package cinema;

public class StatisticsManager {
    // INSTANCE VARIABLES
    private static int purchasedTickets;
    private static String purchasedTicketsPercentage;
    private static int currentIncomeFromTickets;

    // GETTERS AND SETTERS
    public static int getPurchasedTickets() {
        return purchasedTickets;
    }

    public static void setPurchasedTickets(int purchasedTickets) {
        StatisticsManager.purchasedTickets = purchasedTickets;
    }

    public static String getPurchasedTicketsPercentage() {
        return purchasedTicketsPercentage;
    }

    public static void setPurchasedTicketsPercentage(String purchasedTicketsPercentage) {
        StatisticsManager.purchasedTicketsPercentage = purchasedTicketsPercentage;
    }

    public static int getCurrentIncomeFromTickets() {
        return currentIncomeFromTickets;
    }

    public static void setCurrentIncomeFromTickets(int currentIncomeFromTickets) {
        StatisticsManager.currentIncomeFromTickets = currentIncomeFromTickets;
    }

    /**
     * Shows the Statistics for purchased tickets, percentage of tickets bought, current income,
     * and total potential income.
     */
    public static void showStatistics() {
        System.out.println("Number of purchased tickets: " + purchasedTickets);
        // Calculate purchased ticket percentage
        setPurchasedTicketsPercentage(CalculationManager.calculatePurchasedTicketPercentage());
        System.out.println("Percentage: " + purchasedTicketsPercentage + "%");

        // Display current income from tickets
        System.out.println("Current income: $" + currentIncomeFromTickets);

        // Calculate potential income form all tickets
        int totalIncome = CalculationManager.calculatePotentialIncomeFromTickets();
        OutputManager.printTotalIncome(totalIncome);
    }

    /**
     * Increase the purchased ticket amount by 1
     */
    public static void increasePurchasedTickets() {
        purchasedTickets++;
    }

    /**
     * Increase the current ticket income
     * @param amount
     */
    public static void increaseCurrentTicketIncome(int amount) {
        currentIncomeFromTickets += amount;
    }


}
