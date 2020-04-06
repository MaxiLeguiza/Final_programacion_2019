package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectarse {

	public static Connection conexion() {
		Connection con = null;

		String contrasenia = "";
		String usuario = "root";
		String nombre_bd = "ProgramaTienda";

		String url = "jdbc:mysql://localhost:3306/" + nombre_bd
				+ "?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT-3";

		try {
			con = DriverManager.getConnection(url, usuario, contrasenia);
			if (con != null) {
				System.out.println("Se establecio la conexion correctamente");
			}
		} catch (SQLException e) {
			System.out.println("Se ha producido un error al intentar ingresar, porfavor intente nuevamente");
			e.printStackTrace();
		}

		return con;
	}
}
