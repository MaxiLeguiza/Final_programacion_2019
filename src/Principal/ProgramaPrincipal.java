package Principal;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import Conexion.Conectarse;
import Vistas.ControladorLogin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ProgramaPrincipal extends Application {
	static ProgramaPrincipal _instance;
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		_instance = this;
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("MiTienda");

		try {
			
			FXMLLoader l = new FXMLLoader();
			l.setLocation(ControladorLogin.class.getResource("Login.fxml"));
			AnchorPane root = (AnchorPane) l.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static ProgramaPrincipal getInstance() {
		return _instance;
	}

	public static void set_interface(ProgramaPrincipal _interface) {
		ProgramaPrincipal._instance = _interface;
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}


	public static void main(String[] args) {
		launch(args);
	}
	
	public void login(String usuario,String contrasenia) {

		String sql = "SELECT * FROM usuarios WHERE (`usuario`='" + usuario + "' AND `contrasenia`='" + contrasenia+ "')";
		Statement stmt;
		try {
			stmt = Conectarse.conexion().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
//		if (rs.next())
//			abrirMenu();
//		else
//			throw new Exception("El usuario y la contraseña son incorrectos");
	}
	
//	private void abrirMenu() {
//		//***************************************************************************************************		
//
//				FXMLLoader l = new FXMLLoader();
//				l.setLocation(ControladorLogin.class.getResource("menuPrincipal.fxml"));
//
//				AnchorPane root;
//				try {
//
//					root = (AnchorPane) l.load();
//					Scene scene = new Scene(root);
//					primaryStage.setScene(scene);
//
//				} catch (IOException e) {
//
//					e.printStackTrace();
//				}
//
//			}
}
