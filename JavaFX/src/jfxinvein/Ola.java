package jfxinvein;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ola extends Application {

	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage palco) throws Exception {
		StackPane raiz = new StackPane();
		Label lblMensagem = new Label();
		
		lblMensagem.setText("So why the fuck, are those thoughts in my head? \nReach in, and pull them out!");
		
		raiz.getChildren().add(lblMensagem);
		
		Scene cena = new Scene(raiz, 350, 100);
		palco.setTitle("BFMV - JavaFX");
		palco.setScene(cena);
		palco.show();
	}

}
