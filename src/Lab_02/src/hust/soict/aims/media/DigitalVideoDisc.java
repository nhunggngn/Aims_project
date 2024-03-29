package Lab_02.src.hust.soict.aims.media;

public class DigitalVideoDisc extends Dics implements IPlayable{
    private static int nbDigitalVideoDisc = 0;

    public void play() {

        System.out.println("Playing DVD: " + this.getTitle());

        System.out.println("DVD length: " + this.getLength());

    }

    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
    }

    public String toString(){
        return "DVD - " + this.getTitle() + " - " +
                this.getCategory() + " - " + this.getDirector() + " - " +
                this.getLength() + ": " + this.getCost() + "$";
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

