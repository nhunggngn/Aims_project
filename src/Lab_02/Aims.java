package Lab_02;
import java.sql.SQLOutput;
public class Aims {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart anOrder = new Cart();
        // Tạo các DVD và thêm vào giỏ
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        // Hiển thị tổng giá của những DVD trong giỏ
        System.out.println("Tổng tiền của những DVD trong giỏ là: ");
        System.out.println(anOrder.totalCost());
        //xóa dvd1 ra khỏi giỏ hàng
        anOrder.removeDigitalVideoDisc(dvd1);
    }
}
