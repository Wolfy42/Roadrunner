/**
 * Container.java
 *
 * This file is part of the Roadrunner project.
 * 
 * Copyright (c) 2011 Franziskus Domig. All rights reserved.
 *
 * @author Franziskus Domig
 * @date 03.03.2011
 */
package at.roadrunner;

import java.util.HashSet;
import java.util.Set;

/**
 * Class Container
 * 
 * @author Franziskus Domig
 */
public class Container {

	public Container() {
		_items = new HashSet<Item>();
	}

	private final Set<Item> _items;

	public void load(Item item) throws ItemIsAlreadyLoadedException {
		testIfAlreadyLoaded(item);
		_items.add(item);
	}

	private void testIfAlreadyLoaded(Item item)
			throws ItemIsAlreadyLoadedException {
		if (_items.contains(item)) {
			throw new ItemIsAlreadyLoadedException();
		}
	}

	public static class ItemIsAlreadyLoadedException extends Exception {
		private static final long serialVersionUID = 935332355695182505L;
	}

}
