package AppJavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImagemExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane noRaiz = new FlowPane();
		
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		Image img = new Image("giphy.gif");
		
		ImageView iv = new ImageView(img);
		
		noRaiz.getChildren().add(iv);
		
		primaryStage.setScene(minhaCena);
		primaryStage.setTitle("Imagem's");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
