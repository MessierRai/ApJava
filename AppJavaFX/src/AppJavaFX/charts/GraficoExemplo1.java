package AppJavaFX.charts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class GraficoExemplo1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane noRaiz = new FlowPane();
		
		Scene cena = new Scene(noRaiz, 300, 200);
		
		CategoryAxis eixoX = new CategoryAxis();
		NumberAxis eixoY = new NumberAxis();
		
		LineChart<String, Number> grafico = new LineChart<>(eixoX, eixoY);
		
		XYChart.Series<String, Number> maria = new XYChart.Series<>();
		maria.setName("Maria");
		XYChart.Series<String, Number> joao = new XYChart.Series<>();
		joao.setName("João");
		XYChart.Series<String, Number> pedro = new XYChart.Series<>();
		pedro.setName("Pedro");
		
		maria.getData().add(new XYChart.Data<String, Number>("Janeiro", 2500));
		joao.getData().add(new XYChart.Data<String, Number>("Janeiro", 2000));
		pedro.getData().add(new XYChart.Data<String, Number>("Janeiro", 1000));
		
		maria.getData().add(new XYChart.Data<String, Number>("Fevereiro", 500));
		joao.getData().add(new XYChart.Data<String, Number>("Fevereiro", 5000));
		pedro.getData().add(new XYChart.Data<String, Number>("Fevereiro", 2000));
		
		maria.getData().add(new XYChart.Data<String, Number>("Março", 2500));
		joao.getData().add(new XYChart.Data<String, Number>("Março", 0));
		pedro.getData().add(new XYChart.Data<String, Number>("Março", 3000));
		
		grafico.getData().addAll(maria, joao, pedro);
		
		
		noRaiz.getChildren().add(grafico);
		
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
