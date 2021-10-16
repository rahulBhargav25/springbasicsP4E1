package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaHut {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection/beans.xml");
		Pizza p1 = (Pizza) context.getBean("pizza1");
		System.out.println(p1);
		
		Customer c1 = (Customer) context.getBean("customer1");
		System.out.println(c1);
	}
}
