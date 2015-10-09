package newPac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mkutsos on 07.10.2015.
 */
public class ReadTextFile {
    String[] linesAsArray;
    private String line;
    private List<String> lines = new ArrayList<String>();

    public void read(String s) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(s));
        while ((line = reader.readLine()) != null) {
            if (line.length() > 0) {
                lines.add(line);
            }
        }
        linesAsArray = lines.toArray(new String[lines.size()]);
    }
}
