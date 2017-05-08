package AppJavaFX;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboBoxExemplo1 extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		FlowPane noRaiz = new FlowPane();
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		Label lbl = new Label();
		
		ObservableList<String> frutas = FXCollections.observableArrayList("Maça", "Banana", "Laranja", "Pera", "Melancia");
		
		ComboBox<String> combo = new ComboBox<String>(frutas);
		
		combo.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				lbl.setText(newValue);			
			}
			
		});
		
		noRaiz.getChildren().addAll(combo, lbl);
		
		primaryStage.setScene(minhaCena);
		primaryStage.setTitle("Ex CBox");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
