package problem_solving.atm;

import problem_solving.banking.SampleCustomerStore;

import java.util.Date;

public class ATMMachine {

    private String location;
    ATMMachine(){
        this.setup("Base Location");
    }
    ATMMachine(String location){
        this.setup(location);
    }

    void setup(String location){
        this.location = location;
    }

    // only one person can use the atm machine at a time for any atm functions
    // synchronized helps in achieving that since multiple customers cannot use it
    synchronized double checkBalance(String customerName) throws InterruptedException {
        System.out.println("Getting Balance for customer: " + customerName + ". At Location " +  location + ". " + Thread.currentThread() + " - timestamp: " + new Date().getTime());
        SampleCustomerStore customerStore = SampleCustomerStore.getInstanceOf();
        Thread.sleep(300);
        return customerStore.getCustomer(customerName).getDepositAmount();
    }

    synchronized double addMoney(String customerName, double money ){
        System.out.println("Add money for customer: " + customerName + ". At Location " +  location + ". Deposit: " + money + ". " + Thread.currentThread() + " - timestamp: " + new Date().getTime());
        SampleCustomerStore customerStore = SampleCustomerStore.getInstanceOf();
        return customerStore.getCustomer(customerName).addMoney(money);
    }

    synchronized double withdrawMoney(String customerName, double money ) throws Exception {
        System.out.println("Withdraw money for customer: " + customerName + ". At Location " +  location + ". Deposit: " + money + ". " + Thread.currentThread() + " - timestamp: " + new Date().getTime());
        SampleCustomerStore customerStore = SampleCustomerStore.getInstanceOf();
        try {
            Thread.sleep(300);
            return customerStore.getCustomer(customerName).withdrawMoney(money);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " - " + Thread.currentThread() + " - timestamp: " + new Date().getTime());
            throw new Exception(e.getMessage());
        }
    }

}
