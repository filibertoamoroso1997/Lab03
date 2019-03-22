package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SpellCheckerController {
	
	private Dictionary model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextArea textArea1;

    @FXML
    private Button Button1;

    @FXML
    private TextArea textArea2;

    @FXML
    private Label label;

    @FXML
    private Button Button2;

    @FXML
    private Label label1;

    @FXML
    void doClearText(ActionEvent event) {
    	
    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }
    
    public void setModel(Dictionary model) {
    	this.model = model;
    	comboBox.getItems().addAll("English","Italian");
    	comboBox.setValue("English");
    	Button2.setDisable(true);
    }

    @FXML
    void initialize() {
        assert comboBox != null : "fx:id=\"comboBox\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert textArea1 != null : "fx:id=\"textArea1\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert Button1 != null : "fx:id=\"Button1\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert textArea2 != null : "fx:id=\"textArea2\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert Button2 != null : "fx:id=\"Button2\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert label1 != null : "fx:id=\"label1\" was not injected: check your FXML file 'SpellChecker.fxml'.";

    }
}
