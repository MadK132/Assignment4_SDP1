public class Director extends Approver {
    @Override
    public void approveExpense(double amount) {
        if (amount <= 10000) {
            System.out.println("Director approved $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveExpense(amount);
        }
    }
}
