package hust.soict.aims.screen;

import hust.soict.aims.cart.Cart;
import hust.soict.aims.media.*;

import hust.soict.aims.store.MediaStore;
import hust.soict.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class StoreScreen extends JFrame {
    private Store store;
    private Cart cart;
    public StoreScreen(Store store, Cart cart){
        this.store = store;
        this.cart = cart;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }
    JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar(){
        JMenu menu = new JMenu("Options");
        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));
        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN,50));
        title.setForeground(Color.CYAN);
        ButtonListener buttonListener = new ButtonListener(cart);
        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100,50));
        cart.setMaximumSize(new Dimension(100,50));
        header.add(Box.createRigidArea(new Dimension(10,10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10,10)));
        return header;
    }

    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));
        ArrayList<Media> mediaInStore = store.getItemInStore();
        MediaStore.setCart(cart);
        for (int i=0; i < 9; i++){
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }
        return center;
    }

    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", 19.95f, 87, "Roger Allers");
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", 24.95f, 87, "George Lucas");
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Star Wars 2",
                "Science Fiction", 24.95f, 87, "George Lucas");
        store.addMedia(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Star Wars 3",
                "Science Fiction", 24.95f, 87, "George Lucas");
        store.addMedia(dvd4);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Star Wars 4",
                "Science Fiction", 24.95f, 87, "George Lucas");
        store.addMedia(dvd5);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Star Wars 5",
                "Science Fiction", 24.95f, 87, "George Lucas");
        store.addMedia(dvd6);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Star Wars 6",
                "Science Fiction", 24.95f, 87, "George Lucas");
        store.addMedia(dvd7);

        java.util.List<String> author1 = new ArrayList<>();
        author1.add("Nguyễn Ngọc Ánh");
        Book book1 = new Book("Tôi thấy hoa vàng trên cỏ xanh", "Truyện ngắn", 30f, author1);
        store.addMedia(book1);

        List<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("track 1", 3));
        tracks.add(new Track("track 2", 4));
        CompactDisc cd1 = new CompactDisc("Gieo", "Indie", 20f, "Thắng",
                "Ngọt Band", tracks);
        store.addMedia(cd1);
        new StoreScreen(store, cart);
    }
    private class ButtonListener implements ActionListener{
        private Cart cart;

        public  ButtonListener(Cart cart){
            super();
            this.cart = cart;
        }
        public void actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if (button.equals("View cart")){
                cart.print();
            }
        }
    }

}
