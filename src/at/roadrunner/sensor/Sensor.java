/**
 * Sensor.java
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

/**
 * Class Sensor
 * 
 * @author Franziskus Domig
 */
public interface Sensor {

	public String getData() throws IOException;

}
