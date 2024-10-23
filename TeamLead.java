public class TeamLead extends Approver {
    @Override
    public void approveExpense(double amount) {
        if (amount <= 1000) {
            System.out.println("Team Lead approved $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveExpense(amount);
        }
    }
}
