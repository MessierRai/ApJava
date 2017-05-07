package AppJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BotaoExemplo2 extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		FlowPane noRaiz = new FlowPane(); //Layout
		Scene minhaCena = new Scene(noRaiz, 300, 200); //Cena
		
		
		Button btn = new Button();
		btn.setText("Sou eu ABESTADO: o butão!!");
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Olá Abestado!");
			}
		});
		
		noRaiz.getChildren().addAll(btn); //Add nó
		
		primaryStage.setScene(minhaCena);//Add cena ao palco(Stage)
		primaryStage.setTitle("Udemy - Olá Mundo");
		primaryStage.show();//Exibir as coisas
	}

	public static void main(String[] args) {
		launch();
	}

}
