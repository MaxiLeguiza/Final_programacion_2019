package Vistas;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Principal.ProgramaPrincipal;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class ControladorLogin implements Initializable{

	@FXML
	private TextField usuario;
	
	@FXML
	private PasswordField contrasenia;
	
	@FXML
	private void entrar() {
		ProgramaPrincipal.getInstance().login(usuario.getText(), contrasenia.getText());
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		
	}
	
	
}
