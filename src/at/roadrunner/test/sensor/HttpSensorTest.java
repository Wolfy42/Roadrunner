/**
 * HttpSensorTest.java
 *
 * This file is part of the Roadrunner project.
 * 
 * Copyright (c) 2011 Franziskus Domig. All rights reserved.
 *
 * @author Franziskus Domig
 * @date 10.03.2011
 */
package at.roadrunner.test.sensor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import at.roadrunner.sensor.HttpSensor;

/**
 * Class HttpSensorTest
 * 
 * @author Franziskus Domig
 */
public class HttpSensorTest {

	private HttpSensor _httpSensor;

	static private int _pos = 0;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		HttpURLConnection connection = mock(HttpURLConnection.class);

		InputStream stream = new InputStream() {
			@Override
			public int read() throws IOException {
				char[] data = { 1, 7 };
				if (_pos >= data.length) {
					return -1;
				}
				return data[_pos++];
			}
		};

		when(connection.getInputStream()).thenReturn(stream);
		_httpSensor = new HttpSensor(connection);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		_httpSensor = null;
		_pos = 0;
	}

	/**
	 * Test method for {@link at.roadrunner.sensor.HttpSensor#getData()}.
	 */
	@Test
	public void testGetData() {
		try {
			assertEquals("17", _httpSensor.getData());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

}
