package collection;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaHut {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection/beans.xml");
//		Pizza p1 = (Pizza) context.getBean("pizza1");
//		System.out.println(p1);
		
		Customer c1 = (Customer) context.getBean("customer1");
		System.out.println(c1);
		
//		Order o1 =  context.getBean(Order.class);
//		System.out.println(o1);
		//to find what type of object created by Spring
		Set<String> addresses = c1.getAddress();
		
		System.out.println(addresses.getClass().getName());
 	}
}
