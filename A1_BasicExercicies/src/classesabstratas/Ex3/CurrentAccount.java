package classesabstratas.Ex3;

public class CurrentAccount extends Account {
    private double overDraft;

    public CurrentAccount(double overDraft, double entryMoney) {
        this.overDraft = overDraft;
        this.deposit(entryMoney);
    }

    @Override
    public void updateAccount() {
        if (this.getBalance() < 0 ){
            System.out.println("Account " + super.getAccountNumber() + " is under the overDraft.");
        }else{
            System.out.println("Account normal.");
        }
    }

    @Override
    public void withdraw(double sum) {
        if (sum >= 0 && super.getBalance() + sum < super.getBalance() + overDraft) super.withdraw(sum);

        System.err.println("Account.withdraw(...): " + "That withdraw exceeds the overDraft for this account.");
    }
}
