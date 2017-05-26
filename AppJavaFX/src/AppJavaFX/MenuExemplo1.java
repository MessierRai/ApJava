package AppJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane noRaiz = new BorderPane();
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		MenuBar mb = new MenuBar();
		Menu menuArquivo = new Menu("Arquivo");
		MenuItem novo = new MenuItem("Novo");
		MenuItem abrir = new MenuItem("Abrir");
		MenuItem sair = new MenuItem("Sair");
		
		sair.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);				
			}
		});
		
		menuArquivo.getItems().addAll(novo, abrir, sair);
		mb.getMenus().add(menuArquivo);
		
		noRaiz.setTop(mb);
		
		primaryStage.setScene(minhaCena);
		primaryStage.setTitle("MenuEx");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
