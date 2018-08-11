package jFxEventDriven2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class EnlargeHandler implements EventHandler<ActionEvent> {
	private CirclePane circlePane = new CirclePane();
	 @Override // Override the handle method
	 public void handle(ActionEvent e) {
	 circlePane.enlarge();
	 }
	 }
	 