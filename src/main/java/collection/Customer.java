package collection;

import java.util.Map;
import java.util.Set;

public class Customer {
	private int customerid;
	private String customerName;
	private Set<String> address;
	private Map<String, String> specificAddress;
	private Map<Integer, Order> orders;
	
	public Map<Integer, Order> getOrders() {
		return orders;
	}
	public void setOrders(Map<Integer, Order> orders) {
		this.orders = orders;
	}
	public Map<String, String> getSpecificAddress() {
		return specificAddress;
	}
	public void setSpecificAddress(Map<String, String> specificAddress) {
		this.specificAddress = specificAddress;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	//try autowiring
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", address=" + address
				+ ", specificAddress=" + specificAddress + ", orders=" + orders + "]";
	}
}
