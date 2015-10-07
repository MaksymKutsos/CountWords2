package newPac;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.util.*;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class SorterWords {
    ListMultimap<Integer, String> multimap = ArrayListMultimap.create();
    List<Integer> sortByPopularity = new ArrayList<Integer>();
    Set<Integer> set = new HashSet<Integer>();

    public void sort(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            multimap.put(e.getValue(), e.getKey());
            set.add(e.getValue());
        }
        for (Integer i : set) {
            sortByPopularity.add(i);
        }
        Collections.reverse(sortByPopularity);
    }
}
