package autoWiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Drink {

	private String name;

	private String category;

	private double cost;
	
	public Drink() {
		System.out.println("Drink is being prepared");
	}
	
	public Drink(String name, String category, double cost) {
		super();
		this.name = name;
		this.category = category;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Drink [name=" + name + ", category=" + category + ", cost=" + cost + "]";
	}
}
