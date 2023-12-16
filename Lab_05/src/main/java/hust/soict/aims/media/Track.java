package hust.soict.aims.media;
import java.util.Objects;
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Track track = (Track) obj;
        return Objects.equals(title, track.title) && length == track.length;
    }
}