package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc() {

    }
    public DigitalVideoDisc(String title, String category, float cost, int id){
        super(title, category, cost, id);
    }
    public DigitalVideoDisc(String title, String category, float cost, int id,int length,String director){
        super(title, category, cost, id, length, director);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    @Override
    public int compareTo(Media media)
    {
        return (int)(this.getCost() - ((DigitalVideoDisc) media).getCost());
    }
}