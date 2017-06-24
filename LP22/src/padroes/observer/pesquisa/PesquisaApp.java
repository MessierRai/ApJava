package padroes.observer.pesquisa;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PesquisaApp extends JFrame implements ActionListener {

	private JTextField textArgentina;
	private JTextField textBrasil;
	private JTextField textFranca;
	private GraficoPanel grafico;

	public PesquisaApp() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pesquisa - Qual a melhor selecao?");
		setLayout(new BorderLayout());
		criaGUI();

		pack();  
		setVisible(true);
	}

	private void criaGUI() {
		criaPainelGrafico();
		criaPainelVotos();
	}

	private void criaPainelGrafico() {
		grafico = new GraficoPanel();
		add(grafico, BorderLayout.CENTER);
	}

	private void criaPainelVotos() {
		JPanel votos   = new JPanel(new FlowLayout());

		JLabel jb = new JLabel("Argentina");
		votos.add(jb);
		textArgentina = new JTextField(10);
		votos.add(textArgentina);

		jb     = new JLabel("Brasil");
		votos.add(jb);
		textBrasil = new JTextField(10);
		votos.add(textBrasil);

		jb     = new JLabel("França");
		votos.add(jb);
		textFranca  = new JTextField(10);
		votos.add(textFranca);

		JButton atualizaBT = new JButton("Atualizar");
		atualizaBT.addActionListener(this);
		votos.add(atualizaBT);

		add(votos, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String arg = textArgentina.getText();
		String bra = textBrasil.getText();
		String fra = textFranca.getText();
		if (!arg.equals("") && !bra.equals("") && !fra.equals("")) {
			int a = Integer.parseInt(arg);
			int b = Integer.parseInt(bra);
			int f = Integer.parseInt(fra);
	
			grafico.atualizar(a, b, f);
		}
	}

	public static void main(String[] args) {
		PesquisaApp p = new PesquisaApp();
	}

}