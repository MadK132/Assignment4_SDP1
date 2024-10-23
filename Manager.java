public class Manager extends Approver {
    @Override
    public void approveExpense(double amount) {
        if (amount <= 5000) {
            System.out.println("Manager approved $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveExpense(amount);
        }
    }
}
