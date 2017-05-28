package AppJavaFX;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class cadastrarBasic {

	
	public void cds(GridPane malha) throws Exception {
		
		Label nLbl = new Label("Nome: ");
		GridPane.setConstraints(nLbl, 0, 1);
		
		TextField txtFld = new TextField();
		GridPane.setConstraints(txtFld, 0, 2);
		
		Label n1Lbl = new Label("Idade: ");
		GridPane.setConstraints(n1Lbl, 0, 3);
		
		TextField txtFld2 = new TextField();
		GridPane.setConstraints(txtFld2, 0, 4);
		
		Label n2Lbl = new Label("Altura: ");
		GridPane.setConstraints(n2Lbl, 0, 5);
		
		TextField txtFld3 = new TextField();
		GridPane.setConstraints(txtFld3, 0, 6);
		
		malha.getChildren().addAll(nLbl, txtFld, n1Lbl, txtFld2, n2Lbl, txtFld3);
		
	}
	

}
