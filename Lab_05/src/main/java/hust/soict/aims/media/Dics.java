package hust.soict.aims.media;

public class Dics extends Media implements IPlayable{
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

    public Dics(String title, String category, float cost, String director) {
        super(title, category, cost);
        this.director = director;
    }

    @Override
    public void play() {

    }
}
