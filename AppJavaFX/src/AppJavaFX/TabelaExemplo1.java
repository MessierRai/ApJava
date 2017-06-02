package AppJavaFX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TabelaExemplo1 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane noRaiz = new BorderPane();
		
		Scene minhaCena = new Scene(noRaiz, 300, 200);
		
		TableView<Contato> tabela = new TableView<>();
		
		ObservableList<Contato> dados = FXCollections.observableArrayList();
		
		dados.add(new Contato("Joao", "Silva", "silva@silva.com"));
		dados.add(new Contato("Chapolin", "Colorado", "chapolin@chespirito.com"));
		dados.add(new Contato("Joao", "Silva", "silva@silva.com"));
		
		tabela.setItems(dados);
		
		TableColumn<Contato, String> colunaNome = new TableColumn<>("First Name");
		colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tabela.getColumns().add(colunaNome);
		
		TableColumn<Contato, String> colunaSobrenome = new TableColumn<>("Last Name");
		colunaSobrenome.setCellValueFactory(new PropertyValueFactory<>("sobrenome"));
		tabela.getColumns().add(colunaSobrenome);
		
		TableColumn<Contato, String> colunaEmail = new TableColumn<>("Email");
		colunaEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		tabela.getColumns().add(colunaEmail);
		
		noRaiz.setCenter(tabela);
		
		primaryStage.setScene(minhaCena);
		primaryStage.setTitle("Tabela");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
