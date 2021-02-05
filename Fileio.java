//package quiz5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Fileio {
    public static String[] words;
    Calculate calculate = new Calculate();

    public Fileio() throws IOException {
    }

//    We read all files in here

    public String[] readFile(String path) {
        try {
            int i = 0;
            int length = Files.readAllLines(Paths.get(path)).size();
            String[] results = new String[length];
            for (String line : Files.readAllLines(Paths.get(path))) {
                results[i++] = line;
            }
            return results;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

//    We read input files in here

    public void Stackreader(String file) throws IOException {
        Stack stack1 = new Stack();
        ArrayList<Integer> decimals = new ArrayList<>();
        String[] lines = readFile(file);
        for (String line : lines) {
            words = line.split(" ");
            Pattern pattern = Pattern.compile(" ");
            words = pattern.split(line);


            for(String numbers : words){
                decimals.add(Integer.parseInt(numbers));
            }
        }
        calculate.calculate(decimals);
    }
}