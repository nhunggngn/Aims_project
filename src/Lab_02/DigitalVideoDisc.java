package Lab_02;

public class DigitalVideoDisc { //khai báo các thuộc tính
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    //Create class attribute:
    private static int nbDigitalVideoDiscs = 0;
    //Create instance attribute:
    private int id;
    public DigitalVideoDisc(){
        nbDigitalVideoDiscs++; //cập nhật nbDigitalVideoDiscs
        this.id = nbDigitalVideoDiscs; // gán id của đối tượng mới bằng nbDigitalVideoDiscs đã cập nhật
    }

//Create accessors
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }
//Create Constructor
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
}
