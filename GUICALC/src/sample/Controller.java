package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {

    private String operator = "";
    private int x = 0;
    private Model model = new Model();

    @FXML
    private Button clearbtn;

    @FXML
    private TextField display;


    @FXML

    public void OnButtonClicked(javafx.event.ActionEvent event) {

        display.setText(display.getText() + ((Button) event.getSource()).getText());
        if(event.getSource() == clearbtn){
            display.setText("");
        }

    }
    @FXML
    private void operator(javafx.event.ActionEvent event){
        if(((Button) event.getSource()).getText().equals("=")){
            display.setText(model.calculate(operator, x, Integer.parseInt(display.getText())) + "");


        }
        else{
           operator = ((Button) event.getSource()).getText();
           x = Integer.parseInt(display.getText());
           display.setText("");

        }


    }
}


