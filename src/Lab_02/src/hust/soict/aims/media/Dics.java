package Lab_02.src.hust.soict.aims.media;

public class Dics extends Media{
    private int length;
    private String director;

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
    public Dics(String title, String category, float cost, int length, String director){
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }
}
