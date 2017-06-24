package padroes.observer.exemplo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploGUI2 extends JFrame 
	implements ActionListener {

	private JTextField text;
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, text.getText());
	}
	
	public ExemploGUI2() {
        super("Exemplo de GUI em Java");
        setSize(300, 100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	public void buildWindow() {
        JPanel panel = new JPanel(new BorderLayout());

        this.text = new JTextField();
        JButton botao = new JButton("enviar");
        botao.addActionListener(this);
        
        panel.add(text, BorderLayout.PAGE_START);
        panel.add(botao, BorderLayout.CENTER);
        
        this.add(panel);
        this.setVisible(true);
	}
	
    public static void main(String[] args) {
        ExemploGUI2 ex = new ExemploGUI2();
        ex.buildWindow();
    }
	
}
