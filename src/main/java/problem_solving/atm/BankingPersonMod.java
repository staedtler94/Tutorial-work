package problem_solving.atm;

import problem_solving.banking.Customer;
import problem_solving.people.Person;

import java.util.Date;

public class BankingPersonMod implements Runnable {

    private final ATMMachine atmMachine;
    private final Customer customer;
    BankingPersonMod(Customer customer, ATMMachine atmMachine){
        this.customer = customer;
        this.atmMachine = atmMachine;
    }

    @Override
    public void run() {
        double balance = 0;
        try {
            balance = atmMachine.checkBalance(customer.getName());
            System.out.println("The balance for " + customer.getName() + " is " + balance + ". " + Thread.currentThread() + " - timestamp: " + new Date().getTime());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
