package springJdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
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



	

}
