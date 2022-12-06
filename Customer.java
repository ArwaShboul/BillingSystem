import java.util.ArrayList;
import java.util.List;


public class Customer {
	private final List<Customer> customers = new ArrayList<>();

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public  List<Customer> getCustomers() {
		return customers;
	}
}
