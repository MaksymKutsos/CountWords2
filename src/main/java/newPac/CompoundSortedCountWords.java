package newPac;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class CompoundSortedCountWords {
    private List<String> sortedCountWords = new ArrayList<String>();
    public List<String> join(SortWords sorter) {
        for (int i = 0; i < sorter.sortByPopularity.size(); i++) {
            sortedCountWords.add(sorter.transposedCountWords.get(sorter.sortByPopularity.get(i)) + " - " + sorter.sortByPopularity.get(i)) ;
        }
        return sortedCountWords;
    }
}
