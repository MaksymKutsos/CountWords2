package newPac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class CountWords {
    private Map<String, Integer> countWords = new HashMap<String, Integer>();

    public Map<String, Integer> count(List<String> listOfWords) {
        for (int n = 0; n < listOfWords.size(); n = 0) {
            String word = listOfWords.get(n);
            Iterator<String> iterator = listOfWords.iterator();
            int replays = 0;
            while (iterator.hasNext()) {
                String wordFromList = iterator.next();
                if (word.equals(wordFromList)) {
                    replays++;
                    iterator.remove();
                }
            }
            countWords.put(word, replays);
        }
        return countWords;
    }
}