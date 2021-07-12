package model;

import java.util.Date;

public class Item {

	private String name;
	private int id;
	private double cost;
	private ItemType type;
	private int qty = 1;
	private Date expiryDate;
	@SuppressWarnings("unused")
	private double total;

	public Item() {
	}

	public Item(int id, String name, ItemType type, double cost) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.qty = 1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public double getTotal() {
		return Math.round(this.qty * this.cost*100.0)/100.0;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getToString() {
		return "Item [name=" + name + ", cost=" + cost + ", qty=" + qty + ", total=" + this.getTotal() + "]";
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
}
