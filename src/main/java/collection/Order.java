package collection;

import java.util.List;

public class Order {
	private int orderid;
	private List<Meal> meals;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public List<Meal> getMeals() {
		return meals;
	}
	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", meals=" + meals + "]";
	}
}
