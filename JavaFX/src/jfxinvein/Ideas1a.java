package jfxinvein;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ideas1a extends Application {
	
	public static void main(String[] args) {
		launch();
	}
	
	public void one() {
		launch();
	}
	

	@Override
	public void start(Stage stage){
		VBox raiz = new VBox(10);
		raiz.setAlignment(Pos.CENTER);
		
		Button btn = new Button("<-");
		btn.setOnAction((b) -> {
			Ideas1 id2 = new Ideas1();
			id2.start(stage);
		});
		Circle circulo = new Circle(40,40,40);
		circulo.setFill(Color.RED);
		Label unique = new Label("Só pra mostrar isso");
		raiz.getChildren().addAll(unique, btn, circulo);
		
		Scene cena = new Scene(raiz, 200, 65);
		stage.setScene(cena);
		stage.setTitle("Aleatory");
		stage.show();
	}

	

}
