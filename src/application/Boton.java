package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Boton {
	private AnchorPane mypane;
	
	@FXML
	public void crearCuenta() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateAccount.fxml"));

		Stage secondaryStage = new Stage();

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
