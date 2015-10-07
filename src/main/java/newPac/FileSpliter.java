package newPac;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class FileSpliter {
    List<String> listOfWords;

    public void split(String[] mas) {
        StringSpliter stringSpliter = new StringSpliter();
        for (int i = 0; i < mas.length; i++) {
            stringSpliter.split(mas[i]);
        }
        listOfWords = stringSpliter.listOfWords;
    }

}
