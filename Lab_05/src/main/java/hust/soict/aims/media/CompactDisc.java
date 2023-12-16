package hust.soict.aims.media;
import java.util.ArrayList;
import java.util.List;
public class CompactDisc extends Dics implements IPlayable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public void play(){
        for (Track track : tracks){
            track.play();
        }
    }

    public CompactDisc(String title, String category, float cost, String director) {
        super(title, category, cost, director);
    }

    public CompactDisc(String title, String category, float cost, String director, String artist, List<Track> tracks) {
        super(title, category, cost, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) { // kiểm tra xem track này đã có trong danh sách các hay chưa
            tracks.add(track); // nếu chưa có thì thêm vào
            System.out.println("Đã thêm " + track.getTitle() + " vào danh sách phát.");
        }
        else { // nếu đã có thì hiện thông báo
            System.out.println("Track này đã có sẵn trong danh sách.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) { // kiểm tra xem track này đã có trong danh sách các hay chưa
            tracks.remove(track); // nếu có thì xóa đi
            System.out.println("Đã xóa " + track.getTitle() + " ra khỏi danh sách phát.");
        }
        else { // nếu đã có thì hiện thông báo
            System.out.println("Track này không trong danh sách.");
        }
    }

    public List<String> getTracks() {
        List<String> titleTrack = new ArrayList<String>();
        for (Track track: tracks){
            titleTrack.add(track.getTitle());
        }
        return titleTrack;
    }

    public int getLength(List<Track> tracks){
        int sumLength = 0;
        for (Track track : tracks) {
            sumLength += track.getLength();
        }
        return sumLength;
    }

    public String toString(){
        return "CD - " + this.getTitle() + " - " +
                this.getCategory() + " - " + this.getDirector() + " - " + this.getArtist() +
                " - " + this.getTracks() + " - " + this.getLength(tracks) + ": " + getCost() + "$";
    }
}
