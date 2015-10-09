package newPac;

import java.util.List;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class TextSplitWords {
    public List<String>  split(String[] mas) {

        StringSplitWords stringSpliter = new StringSplitWords();

        for (int i = 0; i < mas.length; i++) {
            stringSpliter.split(mas[i]);
        }
       return stringSpliter.listOfWords;
    }

}
