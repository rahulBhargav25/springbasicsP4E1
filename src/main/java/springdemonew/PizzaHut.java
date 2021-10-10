package springdemonew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaHut {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springdemonew/beans.xml");
//		Pizza p = (Pizza) context.getBean("pizza");
//		p.displayPizza();
//		System.out.println(p);
//		
//		Pizza p2 = (Pizza) context.getBean("pizza2");
//		p.displayPizza();
//		System.out.println(p2);
//		
//		Drink d1 = (Drink) context.getBean("drink1");
//		System.out.println(d1);
//		Drink d2 = (Drink) context.getBean("drink2");
//		System.out.println(d2);	
		
		Meal m1 = (Meal) context.getBean("meal1");
		System.out.println(m1);
		Meal m2 = (Meal) context.getBean("meal2");
		System.out.println(m2);
		Meal m3 = (Meal) context.getBean("meal3");
		System.out.println(m3);
		Meal m4 = (Meal) context.getBean("meal4");
		System.out.println(m4);		
	}
}
