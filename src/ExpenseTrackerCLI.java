public class ExpenseTrackerCLI {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        tracker.addExpense("Tea", 10.0);
        tracker.addExpense("Snacks", 20.0);

        for (Expense e : tracker.getExpenses()) {
            System.out.println(e);
        }

        System.out.println("Total Spent: ₹" + tracker.totalAmount());
    }
}
