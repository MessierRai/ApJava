package jfxinvein;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Principal extends Application {
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage palco) throws Exception {
		VBox raiz = new VBox(10);
		raiz.setTranslateX(10);
		raiz.setTranslateY(20);
		
		Label lblTitulo = new Label("Pesquisa sobre programação");
		lblTitulo.setUnderline(true);
		
		final TextField txtNome = new TextField();
		HBox hbNome = new HBox(10);
		hbNome.getChildren().addAll(new Label("Nome"), txtNome);
		
		HBox hbSo = new HBox(20);
		ToggleButton tbLinux = new ToggleButton("Linux");
		tbLinux.setSelected(true);
		ToggleButton tbWindows = new ToggleButton("Windows");
		ToggleButton tbMac = new ToggleButton("Mac");
		final ToggleGroup tgSo = new ToggleGroup();
		tgSo.getToggles().addAll(tbLinux, tbWindows, tbMac);
		hbSo.getChildren().addAll(new Label("Sistema operacional utilizado"), tbLinux, tbWindows, tbMac);
		
		final ToggleGroup tgLinguagem = new ToggleGroup();
		HBox hbLinguagens = new HBox(20);
		RadioButton rbJava = new RadioButton("Java");
		rbJava.setSelected(true);
		RadioButton rbC = new RadioButton("C");
		RadioButton rbPython = new RadioButton("Python");
		tgLinguagem.getToggles().addAll(rbJava, rbC, rbPython);
		hbLinguagens.getChildren().addAll(new Label("Linguagem de programação predileta: "), rbJava, rbC, rbPython);
		
		final CheckBox chkFrequencia = new CheckBox("Programa todo dia?");
		final CheckBox chkGosto = new CheckBox("Gosta de Programação?");
		chkGosto.setAllowIndeterminate(true);
		chkGosto.setIndeterminate(true);
		
		Button btnSubmeter = new Button("Submeter Pesquisa");
		btnSubmeter.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent evt) {
				System.out.println("\t\tResultado da pesquisa para \"" + txtNome.getText() + "\"\n");
				
				ToggleButton tbSo = (ToggleButton) tgSo.getSelectedToggle();
				System.out.print("Sistema Operacional predileto: ");
				System.out.println(tbSo == null ? "Não Selecionado." : tbSo.getText());
				
				RadioButton rbLinguagem = (RadioButton) tgLinguagem.getSelectedToggle();
				System.out.println("Linguagem de Programação: " + rbLinguagem.getText());
				
				System.out.println((chkFrequencia.isSelected() == true ? "P" : "Não p") + "rograma todo dia.");
				
				System.out.println("Gosta de programação: ");
				if(chkGosto.isSelected()) {
					System.out.println("Sim");
				} else if(chkGosto.isIndeterminate()) {
					System.out.println("Não Respondido.");
				}else {
					System.out.println("Não.");
				}
				System.out.println("\n\n");
			}
		});
		
		raiz.getChildren().addAll(lblTitulo, hbNome, hbSo, hbLinguagens, chkFrequencia, chkGosto, btnSubmeter);
		
		Scene cena = new Scene(raiz, 500, 250);
		palco.setTitle("Tratando Eventos");
		palco.setScene(cena);
		palco.show();
	}

}
