package jfxinvein;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TratadorEvento implements EventHandler<ActionEvent> {
	
	@Override
	public void handle(ActionEvent evento) {
		System.out.println("Evento tratado por uma classe externa");
	}

}
