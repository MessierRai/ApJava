package padroes.observer.exemplo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploGUI extends JFrame implements ActionListener {

    private JTextField text;    

    public ExemploGUI() {
        // Indica o titulo do JFrame
        super("Exemplo de GUI em Java");
        // Indica o tamanho do JFrame
        setSize(300, 100);
        // Indica que o JFrame não pode ser redimensionado
        setResizable(false);
        // Indica a ação associada ao botão fechar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void buildWindow() {
        // Cria o painel especificando o layout utilizado
        JPanel panel = new JPanel(new BorderLayout());
        // cria um JTextField
        text = new JTextField();
        // Adiciona o campo de texto no painel indicando sua posição
        panel.add(text, BorderLayout.PAGE_START);
        // Cria um botão fornecendo um nome
        JButton button = new JButton("Enviar");
        // especifica a ação associada ao botão
        button.setActionCommand("enviar");
        // Adiciona o JFrame como ouvinte de a ̧opções do botão
        button.addActionListener(this);
        // Adiciona o botão no painel indicando sua posição
        panel.add(button, BorderLayout.CENTER);
        // Adiciona o painel ao JFrame
        add(panel);
        // Indica que o JFrame deve se visivel
        setVisible(true);
    }

    public void actionPerformed(ActionEvent _e) {
        if (_e.getActionCommand().equals("enviar")) {
            // Recupera o texto do campo de texto
            String msg = text.getText();
            // Exibe a informação para o usuário
            JOptionPane.showMessageDialog(this, msg);
        }
    }

    public static void main(String[] args) {
        ExemploGUI ex = new ExemploGUI();
        ex.buildWindow();
    }


}
