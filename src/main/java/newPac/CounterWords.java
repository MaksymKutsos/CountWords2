package newPac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class CounterWords {
    int i;
    Map<String, Integer> map = new HashMap<String, Integer>();

    public void count(List<String> listOfWords) {
        for (int n = 0; n < listOfWords.size(); n = 0) {
            String st = listOfWords.get(n);
            Iterator<String> iter = listOfWords.iterator();
            while (iter.hasNext()) {
                String str = iter.next();
                if (st.equals(str)) {
                    i++;
                    iter.remove();
                }
            }
            map.put(st, i);
            i = 0;
        }
    }
}