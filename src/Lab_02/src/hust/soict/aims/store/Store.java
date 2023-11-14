package Lab_02.src.hust.soict.aims.store;

import Lab_02.src.hust.soict.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS = 1000; //khai bao hằng cho số lượng DVD tối đa cửa hàng lưu trữ đc
    private DigitalVideoDisc itemInStore[] =
            new DigitalVideoDisc[MAX_NUMBERS]; //tạo danh sách các DVD được thêm vào cửa hàng
    private int qtyInStore = 0; // biến đếm số sách trong cửa hàng

    //Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc disc){
        if(qtyInStore < MAX_NUMBERS){ //nếu số DVD trong cửa hàng chưa vượt quá mức tối đa
            itemInStore[qtyInStore] = disc; //thì thêm DVD mới vào chỉ số tiếp theo của mảng
            qtyInStore++; //tăng chỉ số đếm thêm 1
            System.out.println("Bạn đã nhập thêm DVD " + disc.getTitle() + " vào cửa hàng!");
        }
        else{ //nếu số DVD trong cửa hàng đã đầy thì hiện thông báo
            System.out.println("Cửa hàng không nhận thêm sách nữa!");
        }
    }

    //Phương thức xóa DVD trong cửa hàng
    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false; // tạo biến để kiểm tra có tìm thấy DVD cần xóa không
        for (int i = 0; i < qtyInStore; i++){
            if(itemInStore[i] == disc){ // nếu tìm thấy DVD cần xóa
                for(int j = i; j < qtyInStore - 1; j++){
                    itemInStore[j] = itemInStore[j + 1]; //cập nhật danh sách DVD trong cửa hàng
                }
                itemInStore[qtyInStore - 1] = null; // xóa DVD
                System.out.println("Đã xóa " + disc.getTitle() + " ra khỏi danh sách DVD trong cửa hàng!");
                found = true; //cập nhật để biết đã tìm và xóa được DVD
            }
        }
        if (!found){ //nếu không tìm thấy DVD cần xóa thì hiện thông báo
            System.out.println("Không tìm thấy DVD này trong cửa hàng!");
        }
    }
}
