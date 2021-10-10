package springJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component(value="customerDaoImpl")
public class CustomerDaoImpl implements CustomerDao{

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void addCutomer(Customer customer) {
		String sql = "insert into customer values(?,?,?)";
		int i = jdbcTemplate.update(sql, new Object[] {customer.getCustomerId(), customer.getCustomerName(), customer.getCustomerAddress()});
		
		if(i>0) {
			System.out.println("customer added");
		}
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		String sql = "select * from customer";
		return jdbcTemplate.query(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
				return customer;
			}
			
		});
	}
	
	
	
	
	
//	@Override
//	public List<Customer> getAllCustomers() {
//		String sql = "select * from customer";
//		
//		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Customer>>() {
//
//			@Override
//			public List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException {
//				List<Customer> customers = new ArrayList<Customer>();
//				while(rs.next()) {
//					Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
//					customers.add(customer);
//				}
//				return customers;
//			}
//			
//		});
//	}



	

}
