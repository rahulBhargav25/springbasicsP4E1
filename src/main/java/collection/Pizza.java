package collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Pizza {
	
	private String name;

	private String category;

	private String crust;

	private double cost;
	
	private List<String> topping;
	
	public List<String> getTopping() {
		return topping;
	}

	public void setTopping(List<String> topping) {
		this.topping = topping;
	}


	
	public void displayPizza() {
		System.out.println("this is pizza");
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("1set");
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", category=" + category + ", crust=" + crust + ", cost=" + cost + ", topping="
				+ topping + "]";
	}
	
}
