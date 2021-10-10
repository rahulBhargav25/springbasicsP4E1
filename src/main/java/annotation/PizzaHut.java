package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaHut {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemonew/beans.xml");
		Pizza p1 = context.getBean(Pizza.class);
		System.out.println(p1);
		
		Drink d1 = context.getBean(Drink.class);
		System.out.println(d1);
		
		
	}
}
