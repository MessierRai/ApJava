package AppJavaFX;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Exemplo1 extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		FlowPane noRaiz = new FlowPane(); //Layout
		Scene minhaCena = new Scene(noRaiz, 300, 200); //Cena
		
		/*
		Label label = new Label(); //Nó
		label.setText("Olá Mundo!!");
		*/
		
		Button btn = new Button();
		btn.setText("Sou eu ABESTADO: o butão!!");
		
		btn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() { // um metodo de captura de evento (clique)
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Olá ABESTADO!");
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
