package com.qa.ims.persistence.domain;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class Order_itemTest {
	
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Order_item.class).verify();
	}

}
