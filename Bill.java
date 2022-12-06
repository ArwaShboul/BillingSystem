import java.util.List;


public class Bill {
    private double price;

    public Bill(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double discountBill(Customer customer) {
        Customer regular = new Customer();
        List<Customer> customers = regular.getCustomers();


        if (customer instanceof Employee) { //employee of the store
            price = price - (price * 0.3);
        } else {
            if (customers.contains(customer)) {
                price = price - (price * 0.1);
            } else {
                regular.addCustomer(customer);
            }
        }
        if (price >= 100) {
            price = price - ((price / 100) * 5);
        }
        return price;
    }
}
