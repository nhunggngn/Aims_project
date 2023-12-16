package hust.soict.aims.store;

import hust.soict.aims.cart.Cart;
import hust.soict.aims.media.Dics;
import hust.soict.aims.media.DigitalVideoDisc;
import hust.soict.aims.media.IPlayable;
import hust.soict.aims.media.Media;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {
    private Media media;
    private static Cart cart;
    public MediaStore(Media media){
        this.media = media;
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN,20));
        title.setAlignmentX(CENTER_ALIGNMENT);
        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        ButtonListener buttonListener = new  ButtonListener(media);
        JButton addButton = new JButton("Add to cart");
        container.add(addButton);
        addButton.addActionListener(buttonListener);
        if(media instanceof IPlayable){
            JButton playButton = new JButton("Play");
            container.add(addButton);
            playButton.addActionListener(buttonListener);
        }
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public Cart getCart() {
        return cart;
    }

    public static void setCart(Cart cart) {
        MediaStore.cart = cart;
    }

    private class ButtonListener implements ActionListener{
        private Media media;
        public ButtonListener(Media media){
            super();
            this.media = media;
        }
        public  void  actionPerformed(ActionEvent e){
            String button = e.getActionCommand();
            if (button.equals("Add to cart")){
                cart.addMedia(media);
            }else if (media instanceof Dics dics){
                dics.play();
            }
        }
    }
}
