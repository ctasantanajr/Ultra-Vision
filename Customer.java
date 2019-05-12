import java.io.Serializable;

/**
 * 
 */

/**
 * @author Claudio Santana nr.2017180
 *
 */
public class Customer implements Serializable {
	
	private int registerNumber;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String address;
	private int phone;
	private int totalTitles;
	private int points;
	private Membership membership;
	/**
	 * @param registerNumber
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 * @param address
	 * @param phone
	 * @param totalTitles
	 * @param points
	 * @param membership
	 */
	Customer(int registerNumber, String firstName, String lastName, int dateOfBirth, String address, int phone,
			int totalTitles, int points, Membership membership) {
		this.registerNumber = registerNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phone = phone;
		this.totalTitles = totalTitles;
		this.points = points;
		this.membership = membership;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the dateOfBirth
	 */
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
	/**
	 * @return the totalTitles
	 */
	public int getTotalTitles() {
		return totalTitles;
	}
	/**
	 * @param totalTitles the totalTitles to set
	 */
	public void setTotalTitles(int totalTitles) {
		this.totalTitles = totalTitles;
	}
	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}
	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	/**
	 * @return the membership
	 */
	public Membership getMembership() {
		return membership;
	}
	/**
	 * @param membership the membership to set
	 */
	public void setMembership(Membership membership) {
		this.membership = membership;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [registerNumber=" + registerNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", phone=" + phone + ", totalTitles="
				+ totalTitles + ", points=" + points + ", membership=" + membership + "]" + "\n";
	}

}


