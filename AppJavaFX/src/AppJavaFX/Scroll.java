package AppJavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Scroll extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane bp = new BorderPane();
		
		Scene cena = new Scene(bp, 200, 300);
		 
		Rectangle rect = new Rectangle(100, 500, Color.RED);
		ScrollPane s1 = new ScrollPane();
		s1.setPrefSize(5, 50);
		s1.setContent(rect);
		
		bp.setCenter(s1);
		
		primaryStage.setScene(cena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
