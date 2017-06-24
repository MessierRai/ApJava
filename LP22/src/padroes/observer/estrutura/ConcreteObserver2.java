package padroes.observer.estrutura;

import javax.swing.JOptionPane;

public class ConcreteObserver2 extends Observer {

	public void update(Subject s) {
		ConcreteSubject cs = (ConcreteSubject) s;
		JOptionPane.showMessageDialog(null, 
				cs.getNome() + " : " + cs.getValor());
	}
	
}
