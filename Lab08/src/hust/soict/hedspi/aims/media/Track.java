package hust.soict.hedspi.aims.media;

public class Track implements Playable, Comparable{
    private String title;
    private int length;
    public Track(){

    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
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

    @Override
    public boolean equals(Object obj){
        Track track2 = (Track) obj;
        return (this.title.equals(track2.title) && this.length == track2.length);
    }

    @Override
    public int compareTo(Object o) {
        return this.title.compareTo(((Track) o).getTitle());
    }
}
