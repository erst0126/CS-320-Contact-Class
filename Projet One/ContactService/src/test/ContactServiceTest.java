package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.ContactService.ContactClass;
import contact.ContactService.ContactService;

public class ContactServiceTest {

	 // add contact pass
	 @Test
	 public void testMethodAddPass() {
	    ContactService cs = new ContactService();
	    ContactClass c1 = new ContactClass("1", "Joe", "Biden", "111-111-1111","111 A ST");
	    ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "123-456-7890", "222 B ST");
	    ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "666-555-4444", "333 C ST");
	    // testing add
	    assertEquals(true, cs.add(c1));
	    assertEquals(true, cs.add(c2));
	    assertEquals(true, cs.add(c3));
	 }

	   // add contact fail
	   @Test
	   public void testMethodAddFail() {
	      ContactService cs = new ContactService();
	      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "111-111-1111","111 A ST");
		  ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "123-456-7890", "222 B ST");
		  ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "666-555-4444", "333 C ST");
	       assertEquals(true, cs.add(c1));
	       // testing add
	       assertEquals(false, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));
	   }

	   // delete correct
	   @Test
	   public void testMethodDeletePass() {
	      ContactService cs = new ContactService();
	      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "111-111-1111","111 A ST");
		  ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "123-456-7890", "222 B ST");
		  ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "666-555-4444", "333 C ST");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	       // testing delete
	       assertEquals(true, cs.remove("1"));
	       assertEquals(true, cs.remove("2"));
	   }

	   // delete fail
	   @Test
	   public void testMethodDeleteFail() {
	      ContactService cs = new ContactService();
	      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "111-111-1111","111 A ST");
		  ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "123-456-7890", "222 B ST");
		  ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "666-555-4444", "333 C ST");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));
	       // testing delete
	       assertEquals(false, cs.remove("4"));
	       assertEquals(true, cs.remove("2"));
	   }

	   // update correct
	   @Test
	   public void testUpdatePass() {
	      ContactService cs = new ContactService();
	      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "111-111-1111","111 A ST");
		  ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "123-456-7890", "222 B ST");
		  ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "666-555-444", "333 C ST");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));
	       // testing update
	       assertEquals(true, cs.update("3", "Nancie", "Pelosy", "777-555-4444", "333 D ST"));
	       assertEquals(true, cs.update("2", "Kammy", "Harry", "123-445-6789", "222 B ST"));
	   }

	   // update fail
	   @Test
	   public void testUpdateFail() {
	      ContactService cs = new ContactService();
	      ContactClass c1 = new ContactClass("1", "Joe", "Biden", "111-111-1111","111 A ST");
		  ContactClass c2 = new ContactClass("2", "Kamala", "Harris", "123-456-7890", "222 B ST");
		  ContactClass c3 = new ContactClass("3", "Nancy", "Pelosi", "666-555-4444", "333 C ST");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));
	       // testing update
	       assertEquals(false, cs.update("4", "Cora", "N", "555-444-3333", "445 K St"));
	       assertEquals(true, cs.update("2", "Summer", "Peace", "444-333-2222", "444 K ST"));
	   }

	}
