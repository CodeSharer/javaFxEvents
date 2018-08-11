package jFxEventDriven;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class OKHandlerClass implements EventHandler<ActionEvent> {
 @Override
 public void handle(ActionEvent e) {
 System.out.println("OK button clicked");
 }
 }