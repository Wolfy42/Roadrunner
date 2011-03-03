/**
 * ContainerTest.java
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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import at.roadrunner.Container;

/**
 * Class ContainerTest
 * 
 * @author Franziskus Domig
 */
public class ContainerTest {

	private Container _c;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		_c = new Container();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		_c = null;
	}

	@Test
	public void Container() {
		assertTrue(_c instanceof Container);
	}

	@Test
	public void load() {
		// TODO
	}

	@Test
	public void unload() {
		// TODO
	}

}
