package collection;

import java.util.Set;

public class Customer {
	private int customerid;
	private String customerName;
	private Set<String> address;
	
	
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
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", address=" + address + "]";
	}
}
