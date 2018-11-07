package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controlador {
	@FXML
	private AnchorPane mypane;
	@FXML
	private Label cerrarVentana;

	@FXML
	private Pane pane1 = new Pane();

	@FXML
	private Pane pane2 = new Pane();

	@FXML
	private Pane pane3 = new Pane();

	@FXML
	private Pane pane4 = new Pane();
	@FXML
	public void initialize() {
		
		
		pane1.setStyle("-fx-background-image: url('application/foto1.jpg')");
		pane2.setStyle("-fx-background-image: url('application/foto2.png')");
		pane3.setStyle("-fx-background-image: url('application/foto3.png')");
		pane4.setStyle("-fx-background-image: url('application/foto4.png')");

		backgroundAnimation();

	}
	@FXML
	private void backgroundAnimation() {
		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(5), pane4);
		fadeTransition.setFromValue(1);
		fadeTransition.setToValue(0);
		fadeTransition.play();

		fadeTransition.setOnFinished(event -> {

			FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(3), pane3);
			fadeTransition1.setFromValue(1);
			fadeTransition1.setToValue(0);
			fadeTransition1.play();

			fadeTransition1.setOnFinished(event1 -> {
				FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(3), pane2);
				fadeTransition2.setFromValue(1);
				fadeTransition2.setToValue(0);
				fadeTransition2.play();

				fadeTransition2.setOnFinished(event2 -> {

					FadeTransition fadeTransition0 = new FadeTransition(Duration.seconds(3), pane2);
					fadeTransition0.setFromValue(0);
					fadeTransition0.setToValue(1);
					fadeTransition0.play();

					fadeTransition0.setOnFinished(event3 -> {

						FadeTransition fadeTransition11 = new FadeTransition(Duration.seconds(3), pane3);

						fadeTransition11.setFromValue(0);
						fadeTransition11.setToValue(1);
						fadeTransition11.play();

						fadeTransition11.setOnFinished(event4 -> {

							FadeTransition fadeTransition22 = new FadeTransition(Duration.seconds(3), pane4);

							fadeTransition22.setFromValue(0);
							fadeTransition22.setToValue(1);
							fadeTransition22.play();

							fadeTransition22.setOnFinished(event5 -> {

								backgroundAnimation();
							});

						});

					});

				});
			});

		});

	}

	@FXML
	public void crearCuenta() {
		Cerrar();
		mypane = new AnchorPane();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateAccount.fxml"));

		Stage secondaryStage = new Stage();
		
		try {
			mypane = (AnchorPane) loader.load();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		secondaryStage.setTitle("Probando");
		secondaryStage.setScene(new Scene(mypane));
		secondaryStage.show();

	}

	@FXML
	public void Cerrar() {
		Stage thisStage = (Stage) cerrarVentana.getScene().getWindow();
		thisStage.close();
	}

}
