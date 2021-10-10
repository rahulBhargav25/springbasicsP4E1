package springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jdbcmain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springJdbc/beans.xml");
		CustomerDaoImpl daoImpl = (CustomerDaoImpl) context.getBean("customerDaoImpl");
		
		//Customer customer = new Customer(2, "ramlal", "pune");
		//daoImpl.addCutomer(customer);
		
		
		System.out.println(daoImpl.getAllCustomers());
	
	
	}
}
