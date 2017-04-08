package jfxinvein;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Principal2 extends Application implements EventHandler<ActionEvent> {

	@Override
	public void start(Stage palco) throws Exception {
		VBox raiz = new VBox(20);
		raiz.setAlignment(Pos.CENTER);
		raiz.setTranslateY(5);
		
		Button botao1 = new Button("Clque em mim! (Tratador externo)");
		Button botao2 = new Button("Clque em mim! (Classe anônima)");
		Button botao3 = new Button("Clque em mim! (Propria classe)");
		
		botao1.setOnAction(new TratadorEvento());
		botao2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent evento) {
				System.out.println("Evento tratado por uma classe anonima");
			}
		});
		botao3.setOnAction(this);
		
		raiz.getChildren().addAll(botao1, botao2, botao3);
		
		Scene cena = new Scene(raiz, 300, 200);
		palco.setTitle("Tratando Eventos");
		palco.setScene(cena);
		palco.show();
	}
	
	@Override
	public void handle(ActionEvent evento) {
		System.out.println("Evento tratado na proxima classe");
	}

	public static void main(String[] args) {
		launch();
	}

}
