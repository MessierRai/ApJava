package padroes.observer.estrutura;

import java.util.ArrayList;

public abstract class Subject {

	private ArrayList<Observer> observers;
	
	public Subject() {
		observers = new ArrayList<Observer>();
	}
	
	public void add(Observer o) {
		observers.add(o);
	}

	public void remove(Observer o) {
		observers.remove(o);
	}
	
	public void notificar() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
	
}
