package Lab_02.src.hust.soict.aims.media;

public class Track implements IPlayable{
    private String title;
    private int length;

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public Track(){};
    public Track(String title){
        this.title = title;
    }
    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }
}
