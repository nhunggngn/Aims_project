package Lab_02;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; //khai bao hằng cho số lượng tối đa của giỏ hàng
    private DigitalVideoDisc itemOrder[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; //tạo danh sách các DVD được thêm vào giỏ hàng
    private int qtyOrdered = 0; // biến đếm số sách trong giỏ hàng

//Phương thức thêm DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered < MAX_NUMBERS_ORDERED){ //nếu số DVD trong giỏ hàng chưa vượt quá mức tối đa
            itemOrder[qtyOrdered] = disc; //thêm DVD mới vào chỉ số tiếp theo của mảng
            qtyOrdered++; //tăng chỉ số đếm thêm 1
            System.out.println("Bạn đã thêm DVD " + disc.getTitle() + " vào giỏ hàng!");
        }
        else{ //nếu số DVD trong giỏ đã đầy thì hiện thông báo
            System.out.println("Giỏ hàng đã hết chỗ!");
        }
    }

    //Phương thức thêm 1 list DVD vào giỏ hàng
    public  void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist){
        for(DigitalVideoDisc disc: dvdlist){
            addDigitalVideoDisc(disc);
        }
    }

    //Phương thức thêm DVD vào giỏ hàng với nhiều tham số
    public  void addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc disc2){
        addDigitalVideoDisc(disc1);
        addDigitalVideoDisc(disc2);
    }

//Phương thức xóa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false; // tạo biến để kiểm tra có tìm thấy DVD cần xóa không
        for (int i = 0; i < qtyOrdered; i++){
            if(itemOrder[i] == disc){ // nếu tìm thấy DVD cần xóa
                for(int j = i; j < qtyOrdered - 1; j++){
                   itemOrder[j] = itemOrder[j + 1]; //cập nhật danh sách giỏ hàng
                }
                itemOrder[qtyOrdered - 1] = null; // xóa DVD
                System.out.println("Đã xóa " + disc.getTitle() + " ra khỏi giỏ hàng!");
                found = true; //cập nhật để biết đã tìm và xóa được DVD
            }
        }
        if (!found){ //nếu không tìm thấy DVD cần xóa thì hiện thông báo
            System.out.println("Không tìm thấy DVD này trong giỏ hàng!");
        }
    }
// Phương thức tính tổng giá của các DVD trong giỏ
    public float totalCost(){
        float total = 0; //khai báo biến tính tổng
        //tính tổng giá của từng DVD trong giỏ
        for(int i=0; i<qtyOrdered; i++) total += itemOrder[i].getCost();
        return total; // trả về tổng giá DVD trong giỏ
    }

    // Phương thức in ra thông tin của các DVD trong giỏ và tổng giá
=======

// Phương thức in ra thông tin của các DVD trong giỏ và tổng giá

    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items: ");
        for(int i = 0; i < qtyOrdered; i++){
            System.out.println((i+1) + ". DVD - " + itemOrder[i].getTitle() + " - " +
                    itemOrder[i].getCategory() + " - " + itemOrder[i].getDirector() + " - " +
                    itemOrder[i].getLength() + ": " + itemOrder[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    //Phương thức tìm dvd theo ID
    public void search(int id){
        boolean found = false;
        for(int i = 0; i < qtyOrdered; i++){
            if(itemOrder[i].getId() == id){
                System.out.println(itemOrder[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy DVD có ID: " + id);
        }

    }

    //Phương thức tìm dvd theo title
    public void search(String title){
        boolean found = false;
        for(int i = 0; i < qtyOrdered; i++){
            if (itemOrder[i].isMatch(title)){
                System.out.println(itemOrder[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy DVD có title: " + title);
        }
    }

=======
            }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
}
