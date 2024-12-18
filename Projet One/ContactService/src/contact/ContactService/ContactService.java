package contact.ContactService;

import java.util.ArrayList;

public class ContactService {

	// list of contacts
	private ArrayList<ContactClass> contacts;
	
	//constructor
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	// add contact to array if not present
	public boolean add(ContactClass contact) {
		boolean alreadyPresent = false;
		for (ContactClass c : contacts) {
			if (c.equals(contact)) {
				alreadyPresent = true;
			}
		}
		if(!alreadyPresent) {
			contacts.add(contact);
			return true;
		}
		else {
			return false;
		}
	}
	
	// remove contact if already present
	public boolean remove(String ID) {
		for(ContactClass c : contacts) {
			if(c.getID().equals(ID)) {
				contacts.remove(c);
				return true;
			}
		}
		return false;
	}
	
	// update contact by ID - ID not updated
	public boolean update(String ID, String firstName, String lastName, String phoneNum, String address) {
		for(ContactClass c : contacts) {
			if(c.getID().equals(ID)) {
				if(!firstName.equals(""))
					c.setFirstName(firstName);
				if(!lastName.equals(""))
					c.setLastName(lastName);
				if(!phoneNum.equals(""))
					c.setPhoneNum(phoneNum);
				if(!address.equals(""))
					c.setAddress(address);
				return true;
			}
		}
		return false;
	}
}
