package Lab_02.src.hust.soict.test.cart;

import Lab_02.src.hust.soict.aims.media.DigitalVideoDisc;
import Lab_02.src.hust.soict.aims.cart.Cart;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", 19.95f,87, "Roger Allers");
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars",

                "Science Fiction", 24.95f, 87, "George Lucas");
        cart.addMedia(dvd2);
        cart.print();

    }
}
