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
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import at.roadrunner.Container;
import at.roadrunner.Item;
import at.roadrunner.Container.ItemIsAlreadyLoadedException;

/**
 * Class ContainerTest
 * 
 * @author Franziskus Domig
 */
public class ContainerTest {

	private Container _c;
	private Item _i;

	@Before
	public void setUp() throws Exception {
		_c = new Container();
		_i = mock(Item.class);
	}

	@After
	public void tearDown() throws Exception {
		_c = null;
		_i = null;
	}

	@Test
	public void Container() {
		assertTrue(_c instanceof Container);
	}

	@Test
	public void loadAnItem() throws ItemIsAlreadyLoadedException {
		_c.load(_i);
	}
	
	@Test (expected=ItemIsAlreadyLoadedException.class)
	public void notPossibleToMultipleLoadItem() throws ItemIsAlreadyLoadedException {
		_c.load(_i);
		_c.load(_i);
	}

	@Test
	public void unload()  {
		// TODO
	}

}
