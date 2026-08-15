package problem_solving.banking;

import problem_solving.people.Person;

public class Customer {

    private final Person person;

    public String getBankingId() {
        return bankingId;
    }

    private final String bankingId;

    public double getDepositAmount() {
        return depositAmount;
    }

    public double addMoney(double money){
        depositAmount = depositAmount + money;
        return depositAmount;
    }

    public double withdrawMoney(double withdrawMoney) throws Exception {
        if(withdrawMoney < depositAmount){
            return depositAmount - withdrawMoney;
        }
        throw new Exception("Cannot withdraw Money");
    }

    private double depositAmount;
    public Customer(Person person, double depositAmount){
        this.person = person;
        this.depositAmount = depositAmount;

        int personId = ((int)Math.round(Math.random()*1000));
        this.bankingId = "Sample-id-" + personId;
    }

    public String getName(){
        return person.getName();
    }


}
