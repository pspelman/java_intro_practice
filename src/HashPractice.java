import javax.sound.midi.Track;
import java.util.HashMap;

public class HashPractice {
    public static void main(String[] args) {

        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("Phil", "The boss");
        userMap.put("John", "The trainee");


        String name = userMap.get("Phil");
//        System.out.printf("PHIL got %s%n", name);

        HashMap<String, String> trackList = new HashMap<>();

        TrackList playList = new TrackList();
        playList.addToPlayList("Song Title", "This is a bad song...lalalalalala");
        playList.addToPlayList("Songs are for weenies", "La la la...song song song");
        playList.addToPlayList("Once upon a song", "In the night...song song song");
        playList.addToPlayList("In the beginning", "There were dinosaurs and jesus...lalalala");
        playList.showPlayList();

        System.out.println("Lyrics: " + playList.getSongByTitle("Once upon a song"));
        System.out.println("Lyrics: " + playList.getSongByTitle("woooo"));

    }

}



