package jfxinvein;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class UsoVideo extends Application {
	
	private String VIDEO_URL  = getClass().getResource("/curto.mp4").toString();
	
	public static void main(String[] args) {
		launch();
	}
	
	@Override
	public void start(Stage palco) throws Exception {
		Media media = new Media(VIDEO_URL);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		MediaView mediaView = new MediaView(mediaPlayer);
		
		StackPane raiz = new StackPane();
		raiz.getChildren().add(mediaView);
		Scene cena = new Scene(raiz, 600, 400);
		palco.setTitle("Tocando Video em JavaFX");
		palco.setScene(cena);
		palco.show();
		
		mediaPlayer.play();
	}

}
