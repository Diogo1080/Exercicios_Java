package classesabstratas.Ex3;

public class Bank {
    public String name;
    Account[] accounts = new Account[0];

    public Bank(String name) {
        this.name = name;
    }

    public void addSavingsAccountToBank(float interestRates, double entryMoney) {
        accounts = addElementToArray(accounts);
        accounts[accounts.length - 1] = new SavingsAccount(interestRates, entryMoney);
    }

    public void addCurrentAccountToBank(double overDraft, double entryMoney) {
        accounts = addElementToArray(accounts);
        accounts[accounts.length - 1] = new CurrentAccount(overDraft, entryMoney);
    }

    private Account[] addElementToArray(Account[] Accounts) {
        Account[] newAccount = new Account[Accounts.length + 1];
        for (int i = 0; i < Accounts.length; i++) {
            newAccount[i] = Accounts[i];
        }
        return newAccount;
    }

    public void displayAccounts() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].print();
        }
    }

    public void updateAccounts() {
        for (int i = 0; i < accounts.length; i++){
            accounts[i].updateAccount();
        }
    }

    public void updateAccount(int id){
        accounts[id].updateAccount();
    }
}
