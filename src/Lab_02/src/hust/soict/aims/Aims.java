package Lab_02.src.hust.soict.aims;
import Lab_02.src.hust.soict.aims.cart.Cart;
import Lab_02.src.hust.soict.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart anOrder = new Cart();
        // Tạo các DVD và thêm vào giỏ
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", 19.95f, 87, "Roger Allers");
        anOrder.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", 24.95f, 87, "George Lucas");
        anOrder.addMedia(dvd2);
        // Hiển thị tổng giá của những DVD trong giỏ
        System.out.println("Tổng tiền của những DVD trong giỏ là: ");
        System.out.println(anOrder.totalCost());
        //xóa dvd1 ra khỏi giỏ hàng
        anOrder.removeMedia(dvd1);
    }
}
