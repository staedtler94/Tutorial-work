package problem_solving.banking;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import problem_solving.people.Person;

import java.util.*;

// only for creating a sample Customer list and banking attributes for Problem solving
public class SampleCustomerStore {

    private static SampleCustomerStore INSTANCE;
    private final Map<String, Customer> customerList;
    private SampleCustomerStore(){
        customerList = new HashMap<String, Customer>();
    }

    public static SampleCustomerStore getInstanceOf(){
        if(INSTANCE == null){
            INSTANCE = new SampleCustomerStore();
        };

        return INSTANCE;
    }

    public Collection<Customer> getCustomers(){
        return this.customerList.values();
    }

    public Customer getCustomer(String customerName){
        return customerList.get(customerName);
    }

    public Customer addCustomer(Person p, double deposit){
        Customer c = new Customer(p, deposit);
        customerList.put(c.getName(), c);
        return c;
    }
}
