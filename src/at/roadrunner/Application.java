/**
 * Application.java
 *
 * This file is part of the Roadrunner project.
 * 
 * Copyright (c) 2011 Franziskus Domig. All rights reserved.
 *
 * @author Franziskus Domig
 * @date 03.03.2011
 */
package at.roadrunner;

import at.roadrunner.Container.ItemIsAlreadyLoadedException;

/**
 * Class Application
 * 
 * @author Franziskus Domig
 */
public class Application {

	private int _next_id = 1;

	/**
	 * @return int next id
	 */
	public int getNextId() {
		return _next_id++;
	}

	/**
	 * Main entry point.
	 * 
	 * @param args
	 */
	static public void main(String[] args) {

		// create the application
		Application app = new Application();

		// create first container
		Container container = new Container();

		// create some items
		Item item1 = new Item(app.getNextId());
		Item item2 = new Item(app.getNextId());

		try {
			container.load(item1);
			container.load(item2);

		} catch (ItemIsAlreadyLoadedException e) {
			e.printStackTrace();
		}

	}
}
