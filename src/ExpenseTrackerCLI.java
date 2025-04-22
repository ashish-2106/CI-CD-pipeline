public class ExpenseTrackerCLI {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        tracker.addExpense("Tea", 5.0);
        tracker.addExpense("Snacks", 25.0);

        for (Expense e : tracker.getExpenses()) {
            System.out.println(e);
        }

        System.out.println("Total Spent: rs." + tracker.totalAmount());
    }
}
