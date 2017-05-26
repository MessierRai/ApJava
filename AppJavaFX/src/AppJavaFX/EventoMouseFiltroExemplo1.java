package AppJavaFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventoMouseFiltroExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane noRaiz = new FlowPane();
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		minhaCena.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@SuppressWarnings("incomplete-switch")
			@Override
			public void handle(MouseEvent event) {
				switch(event.getButton()) {
				case MIDDLE:
					event.consume();
					break;
				case SECONDARY: 
					event.consume();
					break;
				}
		}
		}
	);
		
		minhaCena.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("Primeiro botão pressionado: ");
				}
			}
		);
		primaryStage.setScene(minhaCena);
		primaryStage.setTitle("EventoMouse");
		primaryStage.show();
	}

}
