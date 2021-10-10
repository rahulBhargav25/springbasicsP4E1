package springJdbc;

import java.util.List;

public interface CustomerDao {
	public void addCutomer(Customer customer);
	public List<Customer> getAllCustomers(); 
}
