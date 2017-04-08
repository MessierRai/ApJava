package jfxinvein;

import com.sun.javafx.geom.Rectangle;
import com.sun.javafx.scene.shape.*;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	String cores[] = {"Blue", "Red", "Black", "White", "Green", "Yellow", "Gray", "Pink", "Salmon"};

	
	@Override
	public void start(Stage palco) throws Exception {
		StackPane raiz = new StackPane();
		
		HBox opcoes = new HBox(10);
		opcoes.setAlignment(Pos.CENTER);
		
		Rectangle retangulo = new Rectangle(300, 100);
		
		ComboBox<String> cbCorCena = new ComboBox<String>();
		ComboBox<String> cbCorRetangulo = new ComboBox<String>();
		
		cbCorCena.getItems().addAll(cores);
		cbCorRetangulo.getItems().addAll(cores);
		
		opcoes.getChildren().addAll(cbCorCena, cbCorRetangulo);
		
		raiz.getChildren().addAll(retangulo, opcoes);
		
		final Scene cena = new Scene(raiz, 450, 250);
		palco.setTitle("Uso de ComboBox");
		palco.setScene(cena);
		palco.show();
		
		cbCorCena.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
			public void changed(ObservableValue valorObservado, String valorAntigo, String valorNovo) {
				retangulo.setFill(Color.valueOf(valorNovo));
			}
		});
		cbCorCena.getSelectionModel().select(0);
		cbCorRetangulo.getSelectionModel().select(1);
	}

	public static void main(String[] args) {
		launch();
	}

}
