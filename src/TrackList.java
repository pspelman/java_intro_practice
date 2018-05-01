import java.util.HashMap;
import java.util.Iterator;

public class TrackList {

    public HashMap<String, String> playList = new HashMap<>();

    public void addToPlayList(String title, String lyrics) {
        this.playList.put(title, lyrics);
    }

    public String getSongByTitle(String search_title) {
        String song_lyrics;
        System.out.printf("looking for %s%n", search_title);
//        System.out.println(playList.get("Song Title"));

//
        if (this.playList.get(search_title) == null) {
            song_lyrics  = "NO song by that title";
        } else {
            song_lyrics = this.playList.get(search_title);
        }
        return song_lyrics;
//        return this.playList.get("In the beginning");
    }

    public void showPlayList() {
        Iterator iterator = this.playList.entrySet().iterator();
        int count = 1;
        while (iterator.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) iterator.next();
            System.out.println(count + ". " + pair.getKey() + " : " + pair.getValue());
            count++;
//            iterator.next();
//            iterator.remove();
        }
    }

}


