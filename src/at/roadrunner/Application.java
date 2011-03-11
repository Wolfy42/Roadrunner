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

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import at.roadrunner.Container.ItemIsAlreadyLoadedException;
import at.roadrunner.sensor.HttpSensor;
import at.roadrunner.sensor.Sensor;

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

			HttpURLConnection connection = (HttpURLConnection) new URL(
					"http://127.0.0.1:4711").openConnection();

			Sensor s1 = new HttpSensor(connection);
			System.out.println("Sensor 1 Data: " + s1.getData());

		} catch (ItemIsAlreadyLoadedException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
