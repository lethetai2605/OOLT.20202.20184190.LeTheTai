package hust.soict.hedspi.aims.media;


import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(){

    }
    public CompactDisc(String title, String category, float cost, int id){
        super(title, category, cost, id);
    }
    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track){
        for (int i = 0; i < tracks.size(); i++) {
            if(track.getTitle().equals(tracks.get(i).getTitle()))
            {
                System.out.println("The track: " + track.getTitle() + "is already in the list of tracks");
            }
        }
        tracks.add(track);
    }
    public void removeTrack(Track track)
    {
        int k = 0;
        for (int i = 0; i < tracks.size(); i++) {
            if(track.getTitle().equals(tracks.get(i).getTitle()))
            {
                k = 1;
                tracks.remove(track);
                System.out.println("Deleted " + track.getTitle());
            }
        }
        if(k == 0){
            System.out.println("The track " + track.getTitle() + "is not exist" );
        }
    }
    public int getLength(){
        int length = 0;
        for (Track track : tracks){
            length += track.getLength();
        }
        return length;
    }

    @Override
    public void play() {
        for(Track track : tracks)
        {
            track.play();
        }
    }
    @Override
    public int compareTo(Media media){
        CompactDisc compactDisc = (CompactDisc) media;
        int sub = this.tracks.size() - compactDisc.getTracks().size();
        if(sub == 0) {
            return this.getLength() - compactDisc.getLength();
        }
        return sub;
    }

    public List<Track> getTracks() {
        return tracks;
    }
}

