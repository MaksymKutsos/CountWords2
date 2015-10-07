package newPac;

import com.google.common.collect.ListMultimap;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class PrinterByPopularity {

    public void print(SorterWords sorter) {
        for (int i = 0; i < sorter.sortByPopularity.size(); i++) {
            System.out.println(sorter.multimap.get(sorter.sortByPopularity.get(i)) + " - " + sorter.sortByPopularity.get(i));
        }
    }
}
