package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Observable;


public class Controller {


    public TextField textGetName;
    public TextField textGetSchool;


    public ListView listProducts;
    public Label lblName;
    public Label lblSchool;



    public void addFriend(ActionEvent actionEvent) {
        listProducts.getItems().add((new Product(textGetName.getText(), textGetSchool.getText())));
        textGetName.clear();
        textGetSchool.clear();

    }

  public void saveFriend(ActionEvent actionEvent) throws IOException {
      ObservableList<Product> myList = listProducts.getItems();
      for(Product p : myList){
          p.writeToFile();

      }

      listProducts.getItems().clear();
  }

  public void loadFriend(ActionEvent actionEvent) throws IOException{
    listProducts.getItems().clear();
      ArrayList<Product> products = CreateProduct.createAllProducts("products.txt");

      for(Product p : products){
          listProducts.getItems().add(p);


      }

  }



}
