package projectSample1_1;

public class Item {
	private String name;
	private int id;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private double cost;
	private int qty;
	private double total;
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
	public double getTotal() {
		return this.qty*this.cost;
		
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", cost=" + cost + ", qty=" + qty + ", total=" + total + "]";
	}
	
	
}
