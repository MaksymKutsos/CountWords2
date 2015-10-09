package newPac;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class Main {
    static List<String> listOfWords;
    static Map<String, Integer> countWords = new HashMap<String, Integer>();
    static ListMultimap<Integer, String> transposedCountWords = ArrayListMultimap.create();
    static  List<String> sortedCountWords = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        String s = "C:\\Users\\mkutsos\\Desktop\\Test.txt";

        ReadTextFile file = new ReadTextFile();
        file.read(s);

        TextSplitWords spliter = new TextSplitWords();
        listOfWords = spliter.split(file.linesAsArray);

        CountWords counter = new CountWords();
        countWords = counter.count(listOfWords);

        SortWords sorter = new SortWords();
        transposedCountWords = sorter.sort(countWords);

        CompoundSortedCountWords compaund = new CompoundSortedCountWords();
        sortedCountWords = compaund.join(sorter);

        PrintByPopularity printer = new PrintByPopularity();
        printer.print(sortedCountWords);

    }
}