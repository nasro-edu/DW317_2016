/**
 * 
 */
package dw317.lib;

/**
 * @author nasro
 *
 */
/**
 * 
 * a generic class defining Address
 *
 */
public class Address {

	private String civicNumber;
	private String streetName;
	private String cityName="";
	private String zipCodeName="";
	
	//---- default constructor 
	public Address() { 
		civicNumber = streetName = cityName =zipCodeName="";
	}
	// ---- overloading constructor 3 pparams
	public Address (String civicNumber, String streetName, String cityName) {
	this.civicNumber = validateExistence(" Civic Number Error", civicNumber, "Civic Number");
	this.streetName = validateExistence(" Street Name Error", streetName, "street Name");
	this.cityName = validateExistence(" city Name Error", cityName, "city Name");
	
	}
	// ---- overloading constructor all params
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
		this.civicNumber = validateExistence(" Civic Number Error", civicNumber, "Civic Number");
		//this.civicNumber = civicNumber;
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
	
	//---- a generic data member validation method
	private String validateExistence(String topicError, String fieldID, String fieldLabel) {
		 
		if (fieldID== null)
			throw new IllegalArgumentException(topicError + " - " + fieldLabel
					+ " must exist. Invalid value = " + fieldID);
		 String trimmedString = fieldID.trim();
			
		//System.out.println("trimmedString="+trimmedString);
		if(trimmedString.trim().isEmpty())
			throw new IllegalArgumentException(topicError + " - " + fieldLabel
					+ " must exist. Invalid value = " + fieldID);
		return trimmedString;
	}

}
