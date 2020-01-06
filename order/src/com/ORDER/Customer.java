package com.ORDER;

	public class Customer {
	    public int customerId;
	    public String customerName;
	    public int orderId;
	    public String orderName;
	    public String orderType;
	    public int quantity;
		public Customer(int customerId, String customerName,int orderId,String orderName, String orderType,int quantity) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.orderId = orderId;
			this.orderName = orderName;
			 this.orderType = orderType;
			this.quantity = quantity;
			
			
		}
		

	@Override
	public String toString() {
		return "\n------------------\nCustomer Details : \n Customer Id=" + customerId + " \n Customer Name=" + customerName +
				"\n-----------------\nOrder Details : \n Order Id=" +orderId +" \n Order Name="+ orderName+ 
				" \n Order Type="+ orderType+ " \n Quantity="+quantity+"\n[-----------------"+"]";
	}
	
}