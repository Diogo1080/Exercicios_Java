package classesabstratas.Ex3;

import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {
        Bank aBank = new Bank("Moneys");
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            if (rand.nextInt() < 0.5) {
                aBank.addCurrentAccountToBank(rand.nextInt(), Math.round(rand.nextDouble() * 1000) / 100);
            }else{
                aBank.addSavingsAccountToBank(rand.nextFloat(), Math.round(rand.nextDouble() * 10000) / 100);
            }
        }

        for (int i = 0; i < aBank.accounts.length; i++) {
            for (int j = 0; j < rand.nextInt() * 10; j++) {
                if (rand.nextInt() * 10 < 3) {
                    aBank.accounts[i].withdraw(10);
                }else if (rand.nextInt() * 10 > 3 && rand.nextInt() * 10 < 6){
                    aBank.accounts[i].deposit(10);
                }else{
                    aBank.accounts[i].closeAccount();
                }
            }
        }

        aBank.displayAccounts();
        System.out.println("-------------");

        aBank.updateAccounts();

        System.out.println("-------------");

        aBank.displayAccounts();

        System.out.println("-------------");
        aBank.updateAccount(5);
    }
}
