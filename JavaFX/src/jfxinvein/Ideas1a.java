package jfxinvein;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ideas1a extends Application {
	
	public static void main(String[] args) {
		launch();
	}
	

	@Override
	public void start(Stage palco) throws Exception {
		VBox raiz = new VBox(10);
		raiz.setAlignment(Pos.CENTER);
		
		Label unique = new Label("Só pra mostrar isso");
		raiz.getChildren().add(unique);
		
		Scene cena = new Scene(raiz, 200, 50);
		palco.setScene(cena);
		palco.setTitle("Aleatory");
		palco.show();
	}

	

}
