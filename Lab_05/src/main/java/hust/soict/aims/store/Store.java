package hust.soict.aims.store;

import hust.soict.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public static final int MAX_NUMBERS = 1000; //khai bao hằng cho số lượng mặt hàng tối đa cửa hàng lưu trữ đc
    private ArrayList<Media> itemInStore =
            new ArrayList<Media>(); //tạo danh sách các mặt hàng được thêm vào cửa hàng

    public ArrayList<Media> getItemInStore() {
        return itemInStore;
    }

    //Phương thức thêm 1 mặt hàng vào cửa hàng
    public void addMedia(Media media){
        if(itemInStore.size() < MAX_NUMBERS){ //nếu số mặt hàng trong cửa hàng chưa vượt quá mức tối đa
            itemInStore.add(media); //thêm mặt hàng mới vào
            System.out.println("Bạn đã thêm " + media.getTitle() + " vào store!");
        }
        else{ //nếu số mặt hàng trong store đã đầy thì hiện thông báo
            System.out.println("Cửa hàng không nhận thêm mặt hàng mới!");
        }
    }

    //Phương thức xóa mặt hàng khỏi cửa hàng
    public void removeMedia(Media media) {
        boolean found = false; // tạo biến để kiểm tra có tìm thấy mặt hàng cần xóa không
        for (Media media1 : itemInStore){
            if(itemInStore.contains(media1)){ // nếu tìm thấy mặt hàng cần xóa
                itemInStore.remove(media1);
                System.out.println("Đã xóa " + media.getTitle() + " ra khỏi danh sách sản phẩm của cửa hàng!");
                found = true; //cập nhật để biết đã tìm và xóa thành công
            }
        }
        if (!found){ //nếu không tìm thấy mặt hàng cần xóa thì hiện thông báo
            System.out.println("Không tìm thấy mặt hàng này trong cửa hàng!");
        }
    }

    //Phương thức tìm media theo title
    public Media searchMedia(String title){
        for(Media media1 : itemInStore) {
            if (media1.isMatch(title)) {
                return media1;
            }
        }
        return null;
    }

}

