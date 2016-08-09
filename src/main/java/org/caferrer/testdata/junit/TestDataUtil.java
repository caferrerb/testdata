package org.caferrer.testdata.junit;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.caferrer.testdata.util.DataManager;
import org.caferrer.testdata.util.PropertiesManager;

/**
 * Clase responsable de implementar los metodos comunes de todas las pruebas.
 * <br>
 * 
 * @author Camilo Andres Ferrer Bustos<br>
 * 
 * @date 8/08/2016
 * @version 1.0
 */
public abstract class TestDataUtil {
	private static Logger log = Logger.getLogger(TestDataUtil.class);

	/**
	 * 
	 * Método que inicializa los datos de la prueba<br>
	 * 
	 * @author Camilo Andres Ferrer Bustos<br>
	 * 
	 * @date 9/08/2016
	 * @version 1.0
	 * @param nombreTest
	 *
	 */
	public static void iniciar(String nombreTest) {

		

		String nombrearchivo = nombreTest ;
		System.out.println("Inicio::Ejecutando:" + nombrearchivo);
		try {

			DataManager.ejecutarArchivo(nombrearchivo);
		} catch (Exception e) {
			Logger.getLogger(TestDataUtil.class).error(e.getMessage(), e);
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * Método que finaliza los datos de la prueba<br>
	 * 
	 * @author Camilo Andres Ferrer Bustos<br>
	 * 
	 * @date 9/08/2016
	 * @version 1.0
	 * @param nombreTest
	 *
	 */
	public static void terminar(String nombreTest) {
		String nombrearchivo = nombreTest ;
		System.out.println("Fin::Ejecutando:" + nombrearchivo);
		try {

			DataManager.ejecutarArchivo(nombrearchivo);
		} catch (Exception e) {
			Logger.getLogger(TestDataUtil.class).error(e.getMessage(), e);
		}
	}
}
