package Lab_02.src.hust.soict.test.cart;

import Lab_02.src.hust.soict.aims.disc.DigitalVideoDisc;
import Lab_02.src.hust.soict.aims.cart.Cart;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);
        cart.print();
        cart.search(1);
        cart.search(4);
        cart.search("Aladin");
        cart.search("Nhungngn");

    }
}
