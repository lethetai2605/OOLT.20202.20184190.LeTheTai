import hust.soict.globalict.aims.media.Disc;
import hust.soict.globalict.aims.media.Playable;
import hust.soict.globalict.aims.media.Track;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(){

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
}
