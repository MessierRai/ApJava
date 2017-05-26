package AppJavaFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventoMouseExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane noRaiz = new FlowPane();
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		minhaCena.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				int qtdClick = event.getClickCount();
				
				switch(event.getButton()) {
					case PRIMARY:
						System.out.println("Primeiro botão pressionado: ");
						break;
					case MIDDLE:
						System.out.println("Terceiro botão pressionado: ");
						break;
					case SECONDARY:
						System.out.println("Segundo botão pressionado: ");
						break;
					case NONE:
						break;
					default:
						break;
				}
				System.out.println(qtdClick);
			}
		});
		primaryStage.setScene(minhaCena);
		primaryStage.setTitle("EventoMouse");
		primaryStage.show();
	}
	
	public static void mian(String[] args) {
		
	}

}
