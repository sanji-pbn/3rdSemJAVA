package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer implements ModelValidation {

	private String name;
	private String vorname;
	private Address address;
	private String mobileNr;
	private String receipientName;
	private String details;
	private List<Item> items;
	private Date date;

	public Customer() {
		this.items = new ArrayList<>();
		this.date = new Date();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobileNr() {
		return mobileNr;
	}
	public void setMobileNr(String mobileNr) {
		this.mobileNr = mobileNr;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getReceipientName() {
		return receipientName;
	}

	public void setReceipientName(String receipientName) {
		this.receipientName = receipientName;
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

	public boolean validate() {
		if (name.isBlank() || name.isEmpty()) {
			return false;
		} else if (vorname.isBlank() || vorname.isEmpty()) {
			return false;
		} else if (mobileNr.isBlank() || mobileNr.isEmpty()) {
			return false;
		} else if (!address.validate()) {
			return false;
		}		
		return true;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
