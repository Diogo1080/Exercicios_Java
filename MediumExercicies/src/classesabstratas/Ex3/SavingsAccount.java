package classesabstratas.Ex3;

public class SavingsAccount extends Account {
    private float interestRate;

    public SavingsAccount(float interestRate, double entryMoney) {
        this.interestRate = interestRate;
        this.deposit(entryMoney);
    }

    public void addInterest() {
        super.deposit(super.getBalance() * interestRate);
    }

    @Override
    public void updateAccount() {
        addInterest();
        System.out.println("interest added");
    }

    @Override
    public void withdraw(double sum) {
        if (sum >= 0 && super.getBalance() - sum >= 0){
            super.withdraw(sum);
        }else{
            System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
        }
    }
}
