package jfxinvein;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UsoAudio extends Application {
	private String AUDIO_URL = getClass().getResource("/audio/sep.mp3").toString();
	
	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage palco) throws Exception {
		AudioClip clip = new AudioClip(AUDIO_URL);
		clip.play();
		StackPane raiz = new StackPane();
		raiz.getChildren().add(new Text("Tocando Música"));
		Scene cena = new Scene(raiz, 600, 100);
		palco.setTitle("Tocando Audio em JavaFX");
		palco.setScene(cena);
		palco.show();
	}

}
