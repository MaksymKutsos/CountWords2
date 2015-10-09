package newPac;

import java.util.List;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class PrintByPopularity {

    public void print(List<String> sortedCountWords) {
        for (String word : sortedCountWords) {
            System.out.println(word);
        }
    }
}
