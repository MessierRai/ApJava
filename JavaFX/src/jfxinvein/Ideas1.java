package jfxinvein;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ideas1 extends Application {
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage palco) throws Exception {
		VBox raizEsquerda = new VBox(10);
		VBox raizDireita = new VBox(10);
		VBox raizCentro = new VBox(1);
		raizEsquerda.setAlignment(Pos.CENTER_LEFT);
		raizDireita.setAlignment(Pos.CENTER_RIGHT);
		raizCentro.setAlignment(Pos.CENTER);
		
		HBox generalizacao = new HBox(10);
		
		Label lblRE = new Label("Digite algo:");
		TextField areaRE = new TextField();
		
		raizEsquerda.getChildren().addAll(lblRE, areaRE);
		
		Separator separadorCTR = new Separator(Orientation.VERTICAL);
		
		raizCentro.getChildren().addAll(separadorCTR);
		
		Label lblRD = new Label("Digite outro algo:");
		lblRD.setAlignment(Pos.CENTER);
		TextField areaRD = new TextField();
		
		raizDireita.getChildren().addAll(lblRD, areaRD);
		
		generalizacao.getChildren().addAll(raizEsquerda, raizCentro, raizDireita);
		
		Scene cenas = new Scene(generalizacao, 300, 80);
		
		palco.setTitle("Se funcionar, é cagada...");
		palco.setScene(cenas);
		palco.show();
	}

	

}
