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

}
