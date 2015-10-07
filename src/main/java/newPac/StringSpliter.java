package newPac;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class StringSpliter {
    List<String> listOfWords = new ArrayList<String>();

    public void split(String s) {
        String[] lines = s.split(" ");
        for (int i = 0; i < lines.length; i++)
            listOfWords.add(lines[i]);
    }
}

