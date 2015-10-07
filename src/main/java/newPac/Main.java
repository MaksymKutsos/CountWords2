package newPac;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by sansiro on 03.10.2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String s = "C:\\Users\\mkutsos\\Desktop\\Test.txt";

        ReadTextFile file = new ReadTextFile();
        file.read(s);

        FileSpliter spliter = new FileSpliter();
        spliter.split(file.linesAsArray);

        CounterWords counter = new CounterWords();
        counter.count(spliter.listOfWords);

        SorterWords sorter = new SorterWords();
        sorter.sort(counter.map);

        PrinterByPopularity printer = new PrinterByPopularity();
        printer.print(sorter);

    }
}