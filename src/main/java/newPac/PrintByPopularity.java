package newPac;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class PrintByPopularity {

    public void print(SortWords sorter) {
        for (int i = 0; i < sorter.sortByPopularity.size(); i++) {
            System.out.println(sorter.transposedCountWords.get(sorter.sortByPopularity.get(i)) + " - " + sorter.sortByPopularity.get(i));
        }
    }
}
