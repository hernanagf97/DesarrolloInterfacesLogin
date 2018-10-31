package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {
	private AnchorPane mypane;
	@FXML
	private Label cerrarVentana;
	@FXML
	public void crearCuenta() {
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateAccount.fxml"));
		
		Stage secondaryStage = new Stage();

		Stage thisStage = (Stage) cerrarVentana.getScene().getWindow();
		thisStage.close();
		
		try {
			mypane = (AnchorPane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		secondaryStage.setTitle("Probando");
		secondaryStage.setScene(new Scene(mypane));
		secondaryStage.show();
		
		
	}

}
