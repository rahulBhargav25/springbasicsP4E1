package springdemonew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaHut {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemonew/beans.xml");
		Pizza p = (Pizza) context.getBean("pizza");
		p.displayPizza();
		System.out.println(p);
		
		Pizza p2 = (Pizza) context.getBean("pizza2");
		p.displayPizza();
		System.out.println(p2);
	}
}
