import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {
    private List<Expense> expenses;
    private int nextId;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
        nextId = 1;
    }

    public void addExpense(String description, double amount) {
        Expense expense = new Expense(nextId++, description, amount);
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public double totalAmount() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }
}
