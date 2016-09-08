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

	public String getCityName() {
		return cityName;
	}

	public String getZipCodeName() {
		return zipCodeName;
	}

	public void setCivicNumber(String civicNumber) {
		this.civicNumber = civicNumber;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setZipCodeName(String zipCodeName) {
		this.zipCodeName = zipCodeName;
	}
	// added a comment 

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + ((civicNumber == null) ? 0 : civicNumber.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + ((zipCodeName == null) ? 0 : zipCodeName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Address))
			return false;
		Address other = (Address) obj;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName) )
			return false;
		if (civicNumber == null) {
			if (other.civicNumber != null)
				return false;
		} else if (!civicNumber.equals(other.civicNumber))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (zipCodeName == null) {
			if (other.zipCodeName != null)
				return false;
		} else if (!zipCodeName.equals(other.zipCodeName))
			return false;
		return true;
	}
	//add new things
}
