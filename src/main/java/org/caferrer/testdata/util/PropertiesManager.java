package org.caferrer.testdata.util;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 
 * Clase responsable de administrar las propiedades.. <br>
 * 
 * @author Camilo Andres Ferrer Bustos<br>
 * 
 * @date 8/08/2016
 * @version 1.0
 */
public class PropertiesManager {

	private static Properties prop;
	static {
		prop = new Properties();
		try {
			prop.load(ConnectionManager.class.getResourceAsStream("/connectionbd.properties"));
		} catch (IOException e) {
			Logger.getLogger(PropertiesManager.class).error(e.getMessage(), e);
		}
	}

	/**
	 * 
	 * Método que retorna el valor de una propiuedad. <br>
	 * 
	 * @author Camilo Andres Ferrer Bustos<br>
	 * 
	 * @date 8/08/2016
	 * @version 1.0
	 * @param nombre
	 * @return
	 *
	 */
	public static String getPropiedad(String nombre) {
		return prop.getProperty(nombre);
	}
}
