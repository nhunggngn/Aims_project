package hust.soict.aims.screen;

import hust.soict.aims.cart.Cart;
import hust.soict.javafx.CartScreenContronller;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;

import static javafx.application.Application.launch;

public class CartScreen extends JFrame {
    private Cart cart;

    public  CartScreen(Cart cart){
        super();
        this.cart = cart;
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Cart");
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass()
                            .getResource("cart.fxml"));
                    CartScreenContronller contronller =
                            new CartScreenContronller(cart);
                    loader.setController(contronller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        });
    }
}
