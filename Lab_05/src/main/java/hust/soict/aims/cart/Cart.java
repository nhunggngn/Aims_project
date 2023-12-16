package hust.soict.aims.cart;
import hust.soict.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; //khai bao hằng cho số lượng tối đa của giỏ hàng
    //tạo danh sách các mặt hàng được thêm vào giỏ hàng
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    public ObservableList<Media> getItemsOrdered() {
        return (ObservableList<Media>) itemsOrdered;
    }

    //Phương thức thêm 1 mặt hàng vào giỏ hàng
    public void addMedia(Media media){
        if(itemsOrdered.size() < MAX_NUMBERS_ORDERED){ //nếu số mặt hàng trong giỏ hàng chưa vượt quá mức tối đa
            itemsOrdered.add(media); //thêm mặt hàng mới vào giỏ
            System.out.println("Bạn đã thêm " + media.getTitle() + " vào giỏ hàng!");
        }
        else{ //nếu số mặt hàng trong giỏ đã đầy thì hiện thông báo
            System.out.println("Giỏ hàng đã hết chỗ!");
        }
    }

    //Phương thức xóa mặt hàng khỏi giỏ hàng
    public void removeMedia(Media media) {
        boolean found = false; // tạo biến để kiểm tra có tìm thấy mặt hàng cần xóa không
        for (Media media1 : itemsOrdered){
            if(itemsOrdered.contains(media1)){ // nếu tìm thấy mặt hàng cần xóa
                itemsOrdered.remove(media1);
                System.out.println("Đã xóa " + media.getTitle() + " ra khỏi giỏ hàng!");
                found = true; //cập nhật để biết đã tìm và xóa thành công
            }
        }
        if (!found){ //nếu không tìm thấy mặt hàng cần xóa thì hiện thông báo
            System.out.println("Không tìm thấy mặt hàng này trong giỏ hàng!");
        }
    }

    // Phương thức tính tổng giá của các mặt trong giỏ
    public float totalCost(){
        float total = 0; //khai báo biến tính tổng
        //tính tổng giá của từng DVD trong giỏ
        for(Media media : itemsOrdered) total += media.getCost();
        return total; // trả về tổng giá mặt hàng trong giỏ
    }

    // Phương thức in ra thông tin của các DVD trong giỏ và tổng giá
    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items: ");
        int i = 0;
        for(Media media : itemsOrdered){
            i++;
            System.out.println((i) + " - " + media.getTitle() + " - " +
                    media.getCategory() + " - " + ": " + media.getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    //Phương thức tìm media theo ID
    public void search(int id){
        boolean found = false;
        for(Media item: itemsOrdered){
            if(item.getId() == id) {
                System.out.println(item);
                found = true;
            }
        }
        if(!found){
            System.out.println("No match is found");
        }
    }

    //Phương thức tìm media theo title
    public void search(String title){
        boolean found = false;
        for(Media item: itemsOrdered){
            if(item.isMatch(title)){
                System.out.println(item);
                found = true;
            }
        }
        if(!found){
            System.out.println("No match is found");
        }
    }
    public Media searchMedia(String title){
        for(Media media1 : itemsOrdered) {
            if (media1.isMatch(title)) {
                return media1;
            }
        }
        return null;
    }

    public void emptyCart() {
        itemsOrdered.clear();
    }
}
