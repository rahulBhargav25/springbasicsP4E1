package autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Order {
	@Value("1")
	private int orderid;
	
	private Meal meal;
	
	@Autowired
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
