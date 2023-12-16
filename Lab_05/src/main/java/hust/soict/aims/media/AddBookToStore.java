package hust.soict.aims.media;

import hust.soict.aims.cart.Cart;
import hust.soict.aims.screen.AddItemToStoreScreen;
import hust.soict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddBookToStore extends AddItemToStoreScreen {
    public AddBookToStore(Store store, Cart cart) {
        super(store, cart, "Add Book to store", "ADD BOOK TO STORE");
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout (new GridLayout(4, 2, 2, 2));
        addInputRow(center, "Id", tfId);
        addInputRow(center, "Title", tfTitle);
        addInputRow(center, "Category", tfCategory);
        addInputRow(center, "Cost", tfCost);
        return center;
    }

}
