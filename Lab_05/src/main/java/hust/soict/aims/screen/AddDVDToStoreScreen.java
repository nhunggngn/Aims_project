package hust.soict.aims.screen;

import hust.soict.aims.cart.Cart;
import hust.soict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddDVDToStoreScreen extends  AddItemToStoreScreen{
    protected JTextField tfDirector;
    protected JTextField tfLength;

    public AddDVDToStoreScreen(Store store, Cart cart) {
        super(store, cart, "Add DVD to store", "ADD DVD TO STORE");
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        tfDirector = new JTextField(10);
        tfLength = new JTextField(10);
        center.setLayout (new GridLayout(6, 2, 2, 2));
        addInputRow(center, "Id", tfId);
        addInputRow(center, "Title", tfTitle);
        addInputRow(center, "Category", tfCategory);
        addInputRow(center, "Cost", tfCost);
        addInputRow(center, "Director", tfDirector);
        addInputRow(center, "Length", tfLength);
        return center;
    }

}
