package springdemonew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaHut {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemonew/beans.xml");
		Pizza p = (Pizza) context.getBean("pizza");
		p.displayPizza();
	}
}
