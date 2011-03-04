/**
 * ApplicationTest.java
 *
 * This file is part of the Roadrunner project.
 * 
 * Copyright (c) 2011 Franziskus Domig. All rights reserved.
 *
 * @author Franziskus Domig
 * @date 03.03.2011
 */
package at.roadrunner.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import at.roadrunner.Application;

/**
 * Class ApplicationTest
 * 
 * @author Franziskus Domig
 */
public class ApplicationTest {

	protected Application _a;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		_a = new Application();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		_a = null;
	}

	/**
	 * 
	 */
	@Test
	public void Application() {
		assertTrue(_a instanceof Application);
	}

	/**
	 * 
	 */
	@Test
	public void getNextId() {
		assertEquals(_a.getNextId(), 1);
		assertEquals(_a.getNextId(), 2);
		assertEquals(_a.getNextId(), 3);
	}

}
