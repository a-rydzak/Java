import java.util.Set;
import java.util.HashMap;
// hashmap methods: clear, containsKey, containsValue,isEmpty, keySet, remove, replace, size, values.

public class Hashmatique{

	public static void main(String[] args){

		HashMap<String,String> trackMap = new HashMap<String, String>();
		trackMap.put("auth1","song1");
		trackMap.put("auth2","song2");
		trackMap.put("auth3","song3");
		trackMap.put("auth4","song4");

		System.out.println(trackMap.get("auth1"));

		for (String name: trackMap.keySet()){
            String key = name.toString();
            String value = trackMap.get(name).toString();  
            System.out.println(key + ": " + value);  
		} 

	}



//  Create a trackList of type HashMap

//  Add in at least 4 songs that are stored by title

//  Pull out one of the songs by its track title

//  Print out all the track names and lyrics in the format Track: Lyrics
}