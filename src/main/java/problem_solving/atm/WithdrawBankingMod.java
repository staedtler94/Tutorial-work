package problem_solving.atm;

import problem_solving.banking.Customer;

import java.util.Date;

public class WithdrawBankingMod implements Runnable {

    private final ATMMachine atmMachine;
    private final double withdrawalAmount;
    private final Customer customer;
    WithdrawBankingMod(Customer customer, ATMMachine atmMachine, double withdrawalAmount){
        this.customer = customer;
        this.atmMachine = atmMachine;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void run() {
        try {
            double balance = atmMachine.withdrawMoney(customer.getName(), withdrawalAmount);
            System.out.println("The balance for " + customer.getName() + " is " + balance + ". " + Thread.currentThread() + " - timestamp: " + new Date().getTime());
        } catch (Exception e) {
            System.out.println("Cannot perform the actions...");
        }

    }
}
