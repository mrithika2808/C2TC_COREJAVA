package tnsif.daythree.constructor;

public class Customer {
	private String CustomerName;
	private int CustomerId;
	private String CustomerCity;
	
	public Customer() {
		System.out.println("Default Constructor");
	}
	public Customer(String CustomerName, int CustomerId, String CustomerCity) {
		this();
		System.out.println("Parameterized Constructor");
		this.CustomerName= CustomerName;
		this.CustomerId= CustomerId;
		this.CustomerCity=CustomerCity;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [CustomerName=" + CustomerName + ", CustomerId=" + CustomerId + ", CustomerCity="
				+ CustomerCity + ", getCustomerName()=" + getCustomerName() + ", getCustomerId()=" + getCustomerId()
				+ ", getCustomerCity()=" + getCustomerCity() + "]";
	}

}
