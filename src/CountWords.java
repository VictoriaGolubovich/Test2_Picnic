import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountWords {
    Picnic picnic = new Picnic();
    public HashMap<String, Integer> countWord() {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = picnic.getWords();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}
