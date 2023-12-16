package hust.soict.javafx;
import hust.soict.aims.media.IPlayable;
import hust.soict.aims.media.Media;
import hust.soict.aims.cart.Cart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.util.function.Predicate;

public class CartScreenContronller {
    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;

    @FXML
    private TextField tfFilter;

    private Cart cart;
    private FXMLLoader loader;
    @FXML
    private TableView<Media> tbMedia;
    @FXML
    private TableColumn<Media, String> colMediaTitle;
    @FXML
    private TableColumn<Media, String> colMediaCategory;
    @FXML
    private TableColumn<Media, Float> colMediaCost;
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnRemove;
    @FXML
    private Label lbTotalCost;

    public CartScreenContronller(Cart cart){
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize(){
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("catagory"));
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("cost"));
        tbMedia.setItems(this.cart.getItemsOrdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);
        tbMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observableValue, Media oldValue, Media newValue) {
                        if(newValue!=null){
                            updateButtonBar(newValue);
                        }
                    }
                }
        );
        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                showFilteredMedia(newValue);
            }
        });
    }

    void showFilteredMedia(String filterText) {
        ObservableList<Media> mediaList = cart.getItemsOrdered(); 
        FilteredList<Media> filteredMediaList = new FilteredList<>(mediaList); 
        
        Predicate<Media> filterPredicate = media -> {
            return media.getTitle().toLowerCase().contains(filterText.toLowerCase());
        };
        filteredMediaList.setPredicate(filterPredicate);
        tbMedia.setItems(filteredMediaList);

        if (tbMedia.getSelectionModel().getSelectedItem() != null) {
            updateButtonBar(tbMedia.getSelectionModel().getSelectedItem());
        } else {
            btnPlay.setVisible(false);
            btnRemove.setVisible(false);
        }
    }

    private void etVisible(boolean b) {
        
    }

    void updateButtonBar(Media media){
        btnRemove.setVisible(true);
        if (media instanceof IPlayable){
            btnPlay.setVisible(true);
        }
        else {
            btnPlay.setVisible(false);
        }
    }

    @FXML
    void btnRemovePressed (ActionEvent event) throws Exception {
        Media media = tbMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        lbTotalCost.setText(Double.toString(cart.totalCost()) + " $");
    }

    @FXML
    void btnPlaceOrderPressed(ActionEvent event) {

    }

    @FXML
    void btnPlayPressed(ActionEvent event) {

    }
}
