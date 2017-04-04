package jfxinvein;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlesSimples extends Application {

	public static void main(String[] args) {
		launch();
	}
	@Override
	public void start(Stage palco) throws Exception {
		VBox raiz = new VBox(10);
		raiz.setAlignment(Pos.CENTER);
		
		Label rotuloDemo = new Label("Sou um rotulo de texto!");
		rotuloDemo.setTooltip(new Tooltip("Esse é um rótulo para mostrar textos de forma simples"));
		
		TextField campoTexto = new TextField("Digite algo");
		campoTexto.setTooltip(new Tooltip("Campo de texto para entrada de uma só linha"));
		
		TextArea areaTexto = new TextArea("Digite algo com várias linhas");
		areaTexto.setTooltip(new Tooltip("Campo de texto para entrada de multiplas linhas"));
		
		Separator separadorHorizontal = new Separator();
		Separator separadorVertical = new Separator(Orientation.VERTICAL);
		Slider deslizante = new Slider();
		deslizante.setShowTickLabels(true);
		deslizante.setShowTickMarks(true);
		deslizante.setTooltip(new Tooltip("O controle deslizante tem um valor numérico de acordo com sua posição"));
		
		raiz.getChildren().addAll(rotuloDemo, campoTexto, areaTexto, separadorVertical, separadorHorizontal, deslizante);
		
		Scene cena = new Scene(raiz, 300, 400);
		palco.setTitle("Controles Básicos I");
		palco.setScene(cena);
		palco.show();
	}

}
