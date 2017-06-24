package AppJavaFX;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BotaoExemplo2 extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			FlowPane noRaiz = new FlowPane(); //Layout
			Scene minhaCena = new Scene(noRaiz, 300, 200); //Cena
			
			Document doc = new Document(PageSize.A4, 72, 72, 72, 72);
			OutputStream os = new FileOutputStream("out.pdf");
			PdfWriter.getInstance(doc, os);
			doc.open();
			Paragraph p = new Paragraph("Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum ");
			doc.add(p);
			
			Button btn = new Button();
			btn.setText("Gerar");
			
			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if (doc != null) {
		                //fechamento do documento
		                doc.close();
		            }
		            if (os != null) {
		               //fechamento da stream de saída
		               try {
						os.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            }
					System.out.println("Gerado");
				}
			});
			
			noRaiz.getChildren().addAll(btn); //Add nó
			
			primaryStage.setScene(minhaCena);//Add cena ao palco(Stage)
			primaryStage.setTitle("Udemy - Olá Mundo");
			primaryStage.show();//Exibir as coisas
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	public static void main(String[] args) {
		launch();
	}

}
