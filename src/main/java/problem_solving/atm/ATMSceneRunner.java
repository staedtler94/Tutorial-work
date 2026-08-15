package problem_solving.atm;

import problem_solving.banking.Customer;
import problem_solving.banking.SampleCustomerStore;
import problem_solving.people.Person;

public class ATMSceneRunner {

    /***
     * The scene is:
     * There can be more than 1 atm
     * Multiple customers (who are person) can access the atms for transactions.
     *
     * @param args
     */
    public static void main(String[] args) {

        ATMMachine atmHQ = new ATMMachine();
        ATMMachine atmLeaf = new ATMMachine("Wealth Street");

        System.out.println("Here we get a few sample customers ready to interactive in the Mod...");

        SampleCustomerStore customerStore = SampleCustomerStore.getInstanceOf();

        Customer c1 = customerStore.addCustomer( new Person("Sam", 24 ), 2000);
        Customer c2 = customerStore.addCustomer( new Person("Tim", 30 ), 2500);
        Customer c3 = customerStore.addCustomer( new Person("Zen", 34 ), 8000);
        Customer c4 = customerStore.addCustomer( new Person("Abe", 50 ), 25000);

        BankingPersonMod mod1 = new BankingPersonMod(c1, atmHQ);
        BankingPersonMod mod2 = new BankingPersonMod(c2, atmLeaf);
        BankingPersonMod mod3 = new BankingPersonMod(c3, atmHQ);
        BankingPersonMod mod4 = new BankingPersonMod(c4, atmLeaf);

        Thread t1 = new Thread(mod1);
        Thread t2 = new Thread(mod2);
        Thread t3 = new Thread(mod3);
        Thread t4 = new Thread(mod4);

        // each Customer can decide to join the mod whenever they want
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //
        WithdrawBankingMod withdrawalMod1 = new WithdrawBankingMod(c1, atmHQ, 500);
        WithdrawBankingMod withdrawalMod2 = new WithdrawBankingMod(c2, atmLeaf, 2000);
        WithdrawBankingMod withdrawalMod3 = new WithdrawBankingMod(c3, atmHQ, 1000);
        WithdrawBankingMod withdrawalMod4 = new WithdrawBankingMod(c4, atmLeaf, 50000);

        Thread w1 = new Thread(withdrawalMod1);
        Thread w2 = new Thread(withdrawalMod2);
        Thread w3 = new Thread(withdrawalMod3);
        Thread w4 = new Thread(withdrawalMod4);

        // each Customer can decide to join the mod whenever they want
        w1.start();
        w2.start();
        w3.start();
        w4.start();
    }
}
