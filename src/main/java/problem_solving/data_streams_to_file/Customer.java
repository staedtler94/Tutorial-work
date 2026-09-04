package problem_solving.data_streams_to_file;

import java.io.Serializable;

public class Customer  implements Serializable {

    String customerId;
    String name;
    String type;
    static int customerNumbers = 0;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
        this.customerId = "customer-" + ++customerNumbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
