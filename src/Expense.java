public class Expense {
    private int id;
    private String description;
    private double amount;

    public Expense(int id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Description: " + description + " | Amount: ₹" + amount;
    }
}
