package autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaHut {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowireAnnotation/beans.xml");

		
		Order o1 = context.getBean(Order.class);
		System.out.println(o1);
		
	}
}
