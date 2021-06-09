import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
public static void main(String [] args){
    HashMap<String,String> trackList = new HashMap<String,String>();
    trackList.put("firstSong","Hi there");
    trackList.put("secondSong","Hi there2");
    trackList.put("thierdSong","Hi there3");
    trackList.put("fourthSong","Hi there4");
    Set<String> keys = trackList.keySet();
    for(String key : keys){
        System.out.print("Song Title :"+key+" :");
        System.out.println("Song Lyrics :"+trackList.get(key));
    }
}

}