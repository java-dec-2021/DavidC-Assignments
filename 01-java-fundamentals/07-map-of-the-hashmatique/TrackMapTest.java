import java.util.HashMap;
import java.util.Set;
public class TrackMapTest {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Ghost Deini", "Yo, summer time, holding the nine, split the Vega in half Jeeps rumble and my dogs puff grass");
        trackList.put("Apollo Kids", "Aiyo, this rap is like Ziti, facing me real TV, Crush at high speeds, strawberry kiwi");
        trackList.put("Cherchez La Ghost", "Brothers try to pass me, but none could match me No girl can freak me, I'm just too nasty");
        trackList.put("Nutmeg", "Scientific, my hand kissed it Robotic, let's think optimistic You probably missed it, watch me Dolly Dick it");
        
        String trackName = "Nutmeg";
        String trackLyrics = trackList.get(trackName);
        System.out.println(trackName + " : " + trackLyrics);

        System.out.println(" ");
        
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}

