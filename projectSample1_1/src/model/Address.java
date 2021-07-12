

package model;

/**
 * @author pbn-e531
 * */
public class Address implements ModelValidation {

	private String street;
	private String houseNr;
	private String plz;
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}
	

	public String getHouseNr() {
		return houseNr;
	}

	public void setHouseNr(String houseNr) {
		this.houseNr = houseNr;
	}

	@Override
	public boolean validate() {
		if (street.isBlank() || street.isEmpty()) {
			return false;
		}
		if (plz.isBlank() || plz.isEmpty()) {
			return false;
		}
		if (city.isBlank() || city.isEmpty()) {
			return false;
		}
		
		return true;
	}


	@Override
	public String toString() {
		return street +"\n"+ houseNr + "\n"+ plz +"\n"+ city +"\n" ;
	}
	
	

}
