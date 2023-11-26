package Lab_02.src.hust.soict.aims.media;

import Lab_02.src.hust.soict.aims.media.Media;

public class DigitalVideoDisc extends Media { //khai báo các thuộc tính
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

//Create accessors
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(String title) {
        super();
        this.setTitle(title);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }
//Create Constructor
    public DigitalVideoDisc(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
    }

    public String toString(){
        return "DVD - " + getTitle() + " - " +
                getCategory() + " - " + director + " - " +
                length + ": " + getCost() + "$";
    }

    public boolean isMatch(String title){
        if (title.equals(this.getTitle())){
            return true;
        }
        else {
            return false;
        }
    }
}

