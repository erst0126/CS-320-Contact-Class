package contact.ContactService;

public class ContactClass {
	
	private String ID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	// constructor
	public ContactClass(String ID, String firstName, String lastName, String phoneNum, String address) {
		
		// invalid ID
		if(ID == null || ID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		// invalid first name
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		// invalid last name
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		// invalid phone number
		if(phoneNum == null || phoneNum.length() > 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		// invalid address
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	// get ID
	public String getID() {
		return ID;
	}
	
	// set ID
	public void setID(String ID) {
		this.ID = ID;
	}
	
	// get first name
	public String getFirstName() {
		return firstName;
	}
	
	// set first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// get last name
	public String getLastName() {
		return lastName;
	}
	
	// set last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// get phone number
	public String getPhoneNum() {
		return phoneNum;
	}
	
	// set phone number
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	// get address
	public String getAddress() {
		return address;
	}
	
	// set address
	public void setAddress(String address) {
		this.address = address;
	}

}
