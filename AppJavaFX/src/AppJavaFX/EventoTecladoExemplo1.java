package AppJavaFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventoTecladoExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane noRaiz = new FlowPane();
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		primaryStage.setScene(minhaCena);
		
		minhaCena.setOnKeyTyped(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				System.out.println(event.getCharacter());
			}
		});
		
		primaryStage.setTitle("Evento Teclado");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

}
