package autoWiring;

import org.springframework.stereotype.Component;

public class Meal {
	private String mealname;
	public String getMealname() {
		return mealname;
	}
	public void setMealname(String mealname) {
		this.mealname = mealname;
	}
	private Pizza pizza;
	private Drink drink;
	
	public Meal() {System.out.println("Meal is being prepared");}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	@Override
	public String toString() {
		return "Meal [mealname=" + mealname + ", pizza=" + pizza + ", drink=" + drink + "]";
	}
}
