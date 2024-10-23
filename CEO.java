public class CEO extends Approver {
    @Override
    public void approveExpense(double amount) {
        System.out.println("CEO approved $" + amount);
    }
}
