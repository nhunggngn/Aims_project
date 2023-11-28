package Lab_02.src.hust.soict.test.store;

import Lab_02.src.hust.soict.aims.media.DigitalVideoDisc;
import Lab_02.src.hust.soict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", 19.95f, 87, "Roger Allers");
        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars",
                "Science Fiction", 24.95f, 87, "George Lucas");
        store.addMedia(dvd2);
        store.removeMedia(dvd1);
    }
}
