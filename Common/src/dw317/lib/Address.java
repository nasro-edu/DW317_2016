/**
 * 
 */
package dw317.lib;

/**
 * @author your name
 *
 */
public class Address {

	private String civicNumber;
	private String streetName;
	private String cityName="";
	private String zipCodeName="";
	
	
	public Address() { }
	
	public Address (String civicNumber, String streetName) {
	this.civicNumber = civicNumber;
	this.streetName = streetName;
	}
	public Address (String civicNumber, String streetName, String cityName, String zipCodeName) {
	this.civicNumber = civicNumber;
	this.streetName = streetName;
	this.cityName=cityName;
	this.zipCodeName = zipCodeName;
	}
	
	public String getAddress() {
	return civicNumber + " " + streetName + ", " + this.cityName +", "+this.zipCodeName ;
	}
	
	public String getCivicNumber() {
	return civicNumber;
	}
	
	public String getStreetName() {
	return streetName;
	}
	

}
