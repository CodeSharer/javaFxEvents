package jFxEventDriven;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class CancelHandlerClass implements EventHandler<ActionEvent> {
 @Override
 public void handle(ActionEvent e) {
 System.out.println("Cancel button clicked");
 }
 }
