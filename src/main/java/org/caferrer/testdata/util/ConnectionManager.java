package org.caferrer.testdata.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 * Clase responsable de administrar la conexion a la BD <br>
 * 
 * @author Camilo Andres Ferrer Bustos<br>
 * 
 * @date 9/08/2016
 * @version 1.0
 */
public class ConnectionManager {

	/**
	 * 
	 * Método que crea una conexion a la BD.<br>
	 * 
	 * @author Camilo Andres Ferrer Bustos<br>
	 * 
	 * @date 8/08/2016
	 * @version 1.0
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public static Connection getConexion() throws IOException, ClassNotFoundException, SQLException {

		Class.forName(PropertiesManager.getPropiedad("jdbc.driverclass"));
		return DriverManager.getConnection(PropertiesManager.getPropiedad("jdbc.url"),
				PropertiesManager.getPropiedad("jdbc.user"), PropertiesManager.getPropiedad("jdbc.pass"));

	}
}
