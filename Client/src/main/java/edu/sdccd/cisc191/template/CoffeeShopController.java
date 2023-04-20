package edu.sdccd.cisc191.template;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class CoffeeShopController extends CoffeeShop {

        public void displayMenu(ActionEvent a) throws ItemNotFoundException
        {
                printAllMenuItems();
        }
        public void addItemQuantity(ActionEvent a) {
                addItemQuantity();
        }
        public void removeItemQuantity(ActionEvent a) {
                subtractItemQuantity();
        }
        public void showCostcoVendorData(ActionEvent e) throws IOException {costcoVendor();}
        public void showWalmartVendorData(ActionEvent e) throws IOException {walmartVendor();}
        public void addMenuItem(ActionEvent e) {
                addMenuItem();
        }
        public void printIngredientStock(ActionEvent e){printIngredients();}
        public void addIngredientQuantity(ActionEvent e){addIngredientQuantity();}
        public void removeIngredientQuantity(ActionEvent e){removeIngredientQuantity();}
        public void addIngredientItem(ActionEvent e){}
}