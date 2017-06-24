package padroes.observer.pesquisa;

import java.awt.Color;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

@SuppressWarnings("serial")
public class GraficoPanel extends JPanel {

	private String candidatoA = "Argentina";
	private String candidatoB = "Brasil";
	private String candidatoC = "França";

	private ChartPanel chartPanel;
	private DefaultCategoryDataset dados;
	JFreeChart chart;

	public GraficoPanel() {
		criaDados(0, 0, 0);
		criaGrafico();
		chartPanel = new ChartPanel(chart);
		add(chartPanel);
	}

	public void atualizar(int votoA, int votoB, int votoC) {
		criaDados(votoA, votoB, votoC);
		criaGrafico();
		chartPanel.setChart(chart);
		updateUI();
	}

	private void criaGrafico() {
		chart = ChartFactory.createBarChart(
				"Pesquisa - Qual a melhor seleção?", // titulo
				"Candidatos",             // rotulo x
				"Votos",                  // rotulo y
				dados,                    // dados
				PlotOrientation.VERTICAL, // orientacao
				true,                     // legend?
				true,                     // dicas?
				false                     // URLs?
		);
		chart.setBackgroundPaint(Color.white);
	}

	private void criaDados(int a, int b, int c) {
        dados = new DefaultCategoryDataset();

        dados.addValue(a, candidatoA, "Janeiro");
        dados.addValue(b, candidatoB, "Janeiro");
        dados.addValue(c, candidatoC, "Janeiro");
	}
	
}
