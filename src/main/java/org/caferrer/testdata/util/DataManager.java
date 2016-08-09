package org.caferrer.testdata.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * Clase responsable de insertar en BD las sentencias SQL.<br>
 * 
 * @author Camilo Andres Ferrer Bustos<br>
 * 
 * @date 8/08/2016
 * @version 1.0
 */
public class DataManager {

	/**
	 * 
	 * Método que ejecuta un archivo<br>
	 * 
	 * @author Camilo Andres Ferrer Bustos<br>
	 * 
	 * @date 8/08/2016
	 * @version 1.0
	 * @param file
	 * @throws IOException
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 *
	 */
	public static void ejecutarArchivo(String file) throws ClassNotFoundException, SQLException, IOException {

		try (Connection con = ConnectionManager.getConexion();
				BufferedReader entradasql = new BufferedReader(
						new InputStreamReader(DataManager.class.getResourceAsStream("/"+file)))) {
			
			String linea=null;
			while((linea=entradasql.readLine())!=null){
				try(Statement st=con.createStatement()){
					st.executeQuery(linea);
				}
			}
			
		}
	}

}
