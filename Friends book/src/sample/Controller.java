package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class Controller {

    public TextField textGetName;
    public TextField textGetSchool;
    public TextField textGetAge;
    public ListView<Product> productList = new ListView<Product>();
    public Label lblName;
    public Label lblSchool;
    public Label lblAge;
    public Button btnRemove;


    public void addFriend(ActionEvent actionEvent) {
        String name = textGetName.getText();
        String school = textGetSchool.getText();
        int age = Integer.parseInt(textGetAge.getText());

        Product temp = new Product(name, school, age);
        productList.getItems().add(temp);
        textGetName.clear();
        textGetSchool.clear();
        textGetAge.clear();
    }

   public void displayFriend(MouseEvent mouseEvent){
       Product temp;
       temp = productList.getSelectionModel().getSelectedItem();
       lblName.setText(temp.name);
       lblSchool.setText(temp.school);
       lblAge.setText(Integer.toString(temp.getAge()));

   }

   public void removeFriend(ActionEvent actionEvent){

       productList.getItems().remove(productList.getSelectionModel().getSelectedItem());
       lblName.setText(" ");
       lblSchool.setText("");
       lblAge.setText("");



   }



}
