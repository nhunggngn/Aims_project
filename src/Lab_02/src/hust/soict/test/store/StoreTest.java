package Lab_02.src.hust.soict.test.store;

import Lab_02.src.hust.soict.aims.disc.DigitalVideoDisc;
import Lab_02.src.hust.soict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);
        store.removeDVD(dvd1);
    }
}
