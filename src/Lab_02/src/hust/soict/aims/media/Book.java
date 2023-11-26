package Lab_02.src.hust.soict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();
    public Book(){};

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) { // kiểm tra xem trong authors đã tồn tại authorName chưa
            authors.add(authorName); // nếu chưa có thì thêm vào
            System.out.println("Đã thêm " + authors + " vào danh sách.");
        }
        else { // nếu đã có thì hiện thông báo
            System.out.println("Tác giả này đã được thêm vào danh sách từ trước.");
        }
    }

    public void removeAuthor(String authorName){
        if (authors.contains(authorName)) { // kiểm tra xem trong authors đã tồn tại authorName chưa
            authors.remove(authorName); // nếu có thì xóa đi
            System.out.println("Đã xóa " + authors + " khỏi danh sách.");
        }
        else { //nếu không có thì hiện thông báo
            System.out.println("Không tìm thấy tác giả này trong danh sách.");
        }
    }
}
