import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BillTest {

    @Test
    public void testCustomerCase() {
        //Normal Customer
        Bill bill = new Bill(220);
        Customer customer = new Customer();
        double actual = bill.discountBill(customer);
        assertEquals(209, actual, 0);
    }

    @Test
    public void testEmployeeCase() {
        //case 1 Employee
        Bill bill = new Bill(160);
        Employee employee = new Employee(1, "Jak");
        double actual = bill.discountBill(employee);
        assertEquals(106.4, actual, 0);
    }
}
