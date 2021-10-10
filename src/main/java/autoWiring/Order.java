package autoWiring;

public class Order {
	private int orderid;
	private Meal meal;
	public Order(int orderid, Meal meal) {
		super();
		this.orderid = orderid;
		this.meal = meal;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", meal=" + meal + "]";
	}
}
