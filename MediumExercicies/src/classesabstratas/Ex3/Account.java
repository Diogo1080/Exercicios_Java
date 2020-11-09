package classesabstratas.Ex3;

public abstract class Account {
    private double balance;
    private int accNumber;
    private int state;
    private static int amount = 1;


    public Account() {
        balance = 0.0;
        state = 1;
        accNumber = amount++;
    }

    public void closeAccount(){
        state=0;
    }

    public void openAccount(){
        state=1;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
            return;
        }else{
            System.err.println("Account.deposit(...): " + "cannot deposit negative amount.");
        }
    }

    public void withdraw(double sum) {
        if (sum > 0) {
            balance -= sum;
        }else{
            System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
        }

    }

    public double getBalance() {
        return balance;
    }

    public double getAccountNumber() {
        return accNumber;
    }

    public String toString() {
        if (state==1) {
            return "Acc " + accNumber + ": " + "balance = " + balance;
        }
        return "Account closed!";
    }

    public final void print() {
        //Don't override this,
        //override the toString method
        System.out.println(toString());
    }

    public void updateAccount(){};
}

