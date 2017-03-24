package herewegoagain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JFXIntro extends Application {
	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage palco) throws Exception {
		StackPane raiz = new StackPane();
		Label lblMensagem = new Label();
		
		lblMensagem.setText("Estou aprendendo JavaFX!");
		raiz.getChildren().add(lblMensagem);
		
		Scene cena = new Scene(raiz, 250, 50); // conteudo/largura/altura
		palco.setTitle("Aprendendo JavaFX");
		palco.setScene(cena);
		palco.show();
	}
}
