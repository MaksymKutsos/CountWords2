package newPac;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.util.*;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class SortWords {
    ListMultimap<Integer, String> transposedCountWords = ArrayListMultimap.create();
    List<Integer> sortByPopularity = new ArrayList<Integer>();
    Set<Integer> uniqeWords = new HashSet<Integer>();

    public ListMultimap <Integer, String>  sort(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            transposedCountWords.put(e.getValue(), e.getKey());
            uniqeWords.add(e.getValue());
        }
        for (Integer i : uniqeWords) {
            sortByPopularity.add(i);
        }
        Collections.reverse(sortByPopularity);
        return transposedCountWords;
    }
}
