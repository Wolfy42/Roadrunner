/**
 * HttpSensor.java
 *
 * This file is part of the Roadrunner project.
 * 
 * Copyright (c) 2011 Franziskus Domig. All rights reserved.
 *
 * @author Franziskus Domig
 * @date 10.03.2011
 */
package at.roadrunner.sensor;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Class HttpSensor
 * 
 * @author Franziskus Domig
 */
public class HttpSensor implements Sensor {

	protected HttpURLConnection _connection;

	public HttpSensor(HttpURLConnection connection) {
		_connection = connection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.roadrunner.sensor.Sensor#getData()
	 */
	public String getData() throws IOException {
		StringBuilder string = new StringBuilder();
		int b = 0;
		while (-1 != (b = _connection.getInputStream().read())) {
			string.append(String.valueOf(b));
		}
		return string.toString();
	}
}
