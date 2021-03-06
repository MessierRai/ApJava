package AppJavaFX;

import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class lg extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane malha = new GridPane();
		malha.setAlignment(Pos.CENTER);
		malha.setHgap(10);
		malha.setVgap(10);
		malha.setPadding(new Insets(25, 25, 25, 25)); //define os pixels para as bordas
		malha.setBackground(new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY))); // responsavel por colorir o GridPane
		
		Scene cena = new Scene(malha, 300, 190);
		
		Text sds = new Text("Olá!");
		sds.setFont(Font.font(25)); //define o tamanho da fonte, pode-se colocar que fonte quer tambem
		GridPane.setConstraints(sds, 0, 0);
		
		Label userLbl = new Label("Usuário: ");
		GridPane.setConstraints(userLbl, 0, 1);
		
		
		TextField caixaId = new TextField();
		GridPane.setConstraints(caixaId, 1, 1);
		
		Label pwdLbl = new Label("Senha: ");
		GridPane.setConstraints(pwdLbl, 0, 2);
		
		PasswordField caixaPwd = new PasswordField(); // especialmente para senhas
		GridPane.setConstraints(caixaPwd, 1, 2);
		
		Button btnLog = new Button("Okay? Okay!");
		
		/*
		btnLog.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent apertar) {
				telaPrincipal1 tp1 = new telaPrincipal1();
				try {
					tp1.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		*/
		
		HBox setBtn = new HBox(10);
		setBtn.setAlignment(Pos.CENTER_RIGHT); // faz o botao de login ficar mais a direita
		setBtn.getChildren().add(btnLog);
		GridPane.setConstraints(setBtn, 1, 3);
		
		malha.getChildren().addAll(sds, userLbl, caixaId, pwdLbl, caixaPwd, setBtn);
		
		primaryStage.setScene(cena);
		primaryStage.setTitle("Log-In");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

}
