package text;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by sansiro on 03.10.2015.
 */
public class KMNClass {
    String[] mas;
    static List<String> listOfWords = new ArrayList<String>();
    static Map<String, Integer> map = new HashMap<String, Integer>();
    static ListMultimap<Integer, String> multimap = ArrayListMultimap.create();
    static List<Integer> sortByPopularity = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        String s = "C:\\Users\\mkutsos\\Desktop\\Test.txt";
        String[] mas = readFile(s);
        splitFile(mas);
        countWords(listOfWords);
        sortWords(map);
        print();
    }

    private static void print() { // ????? ???? ? ???????? ?? ?????????? ? ???????
        for (int i = 0; i < sortByPopularity.size(); i++) {
            System.out.println(multimap.get(sortByPopularity.get(i)) + " - " + sortByPopularity.get(i));
        }
    }

    private static void sortWords(Map<String, Integer> map) { // ?????????? ???? ?? ????????????
        Set<Integer> set = new HashSet<Integer>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            multimap.put(e.getValue(), e.getKey());
            set.add(e.getValue());
        }
        for (Integer i : set) {
            sortByPopularity.add(i);
        }
        Collections.reverse(sortByPopularity);
    }


    private static void countWords(List<String> listOfWords) {  // ??????? ???? ? ?????? ? ??????? ????? - ?????????? ??????????
        int i = 0;
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

    private static void splitFile(String[] mas) { //???????? ????? ?????? ?? ????????? ?????
        for (int i = 0; i < mas.length; i++) {
            splitString(mas[i]);
        }
    }


    public static void splitString(String s) { // ???????? ?????? ?? ????????? ?????
        String[] lines = s.split(" ");
        for (int i = 0; i < lines.length; i++)
            listOfWords.add(lines[i]);
    }


    public static String[] readFile(String s) throws IOException { //
        BufferedReader reader = new BufferedReader(new FileReader(s));
        String line;
        List<String> lines = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            if (line.length() > 0) {
                lines.add(line);
            }
        }
        String[] linesAsArray = lines.toArray(new String[lines.size()]);
        return linesAsArray;
    }
}