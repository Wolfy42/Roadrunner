/**
 * ItemTest.java
 *
 * This file is part of the Roadrunner project.
 * 
 * Copyright (c) 2011 Franziskus Domig. All rights reserved.
 *
 * @author Franziskus Domig
 * @date 03.03.2011
 */
package at.roadrunner.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import at.roadrunner.Item;

/**
 * Class ItemTest
 * 
 * @author Franziskus Domig
 */
public class ItemTest {

	/**
	 * 
	 */
	@Test
	public void Item() {
		Item i = new Item(4711);
		assertTrue(i instanceof Item);
	}
}
