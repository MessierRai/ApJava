package jfxinvein;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
		Button btnRE = new Button("Enviar Algo (1)");
		btnRE.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent evento1a) {
				System.out.println("Caixa de coisas 1 - Conteúdo: " + areaRE.getText());
			}
		});
		
		raizEsquerda.getChildren().addAll(lblRE, areaRE, btnRE);
		
		Separator separadorCTR = new Separator(Orientation.VERTICAL);
		
		raizCentro.getChildren().addAll(separadorCTR);
		
		Label lblRD = new Label("Digite outro algo:");
		lblRD.setAlignment(Pos.CENTER);
		TextField areaRD = new TextField();
		Button btnRD = new Button("Enviar Algo (2)");
		btnRD.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent evento) {
				System.out.println("Caixa de coisas 2 - Conteúdo: " + areaRD.getText());				
			}
		});
		
		raizDireita.getChildren().addAll(lblRD, areaRD, btnRD);
		
		generalizacao.getChildren().addAll(raizEsquerda, raizCentro, raizDireita);
		
		Scene cenas = new Scene(generalizacao, 300, 95);
		
		palco.setTitle("Se funcionar, é cagada...");
		palco.setScene(cenas);
		palco.show();
	}

	

}
