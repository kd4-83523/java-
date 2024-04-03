package com.sunbeam.invoice;

public class Invoice {
	private String partnumber;
	private String description;
	private int quantity;
	private double price;
public Invoice()
{
	partnumber="";
	description="";
	quantity=0;
	price=0.0;
	
}
public Invoice(String partnumber, String description, int quantity, double price) {
	super();
	this.partnumber = partnumber;
	this.description = description;
	this.quantity = quantity;
	this.price = price;
}
public String getPartnumber() {
	return partnumber;
}
public void setPartnumber(String partnumber) {
	this.partnumber = partnumber;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
Double CalculateInvoice()
{
	return price*quantity;
}
	
public void setquantity(int qty)

{
	if(quantity<0)
	{
		quantity=0;
	}
	this.quantity=quantity;
}
}
