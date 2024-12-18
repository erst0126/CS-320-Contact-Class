package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import contact.ContactService.ContactClass;

import org.junit.jupiter.api.Assertions;

class ContactClassTest {

	@Test
	void test() {
		
		ContactClass contactClass = new ContactClass ("123", "Emily", "Staats", "999-999-9999", "123 NE 45 St.");
		
		assertTrue(contactClass.getID().equals("123"));
		assertTrue(contactClass.getFirstName().equals("Emily"));
		assertTrue(contactClass.getLastName().equals("Staats"));
		assertTrue(contactClass.getPhoneNum().equals("999-999-9999"));
		assertTrue(contactClass.getAddress().equals("123 NE 45 St."));
	}
		
	@Test // ID too long
	void testIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("1234567891011", "Emily", "Staats", "999-999-9999", "123 NE 45 St.");
		 });      }
	
	@Test // first name too long
	void testFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Emily Renaee", "Staats", "999-999-9999", "123 NE 45 St.");
		 });      }
	
	@Test // last name too long
	void testLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Emily", "Renae Staats", "999-999-9999", "123 NE 45 St.");
		 });      }
	
	@Test // phone number too long
	void testPhoneNumToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Emily", "Staats", "999-9999-99999", "123 NE 45 St.");
		 });      }
	
	@Test // address too long
	void testAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Emily", "Staats", "999-999-9999", "12345678901234 NE 12345678901234 St.");
		 });      }
	
	@Test // null ID
	void testNullID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass(null, "Emily", "Staats", "999-999-9999", "123 NE 45 St.");
		 });      }
	
	@Test // null first name
	void testNullFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", null, "Staats", "999-999-9999", "123 NE 45 St.");
		 });      }
	
	@Test // null last name
	void testContactClassLastNameIsNull() {
		// testing for IllegalArgumentException
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Emily", null, "999-999-9999", "123 NE 45 St.");
		 });      }
	
	@Test // null phone number
	void testNullPhoneNum() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Emily", "Staats", null, "123 NE 45 St.");
		 });      }
	
	@Test // null address
	void testNullAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new ContactClass("123456789", "Emily", "Staats","999-999-9999", null);
		 });      }

		
	}
