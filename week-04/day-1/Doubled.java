import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        String path = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/duplicated-chars.txt";

        try {
            System.out.println(decryptDoubled(path));
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    static String decryptDoubled(String path) throws IOException {
        Path p = Paths.get(path);
        List<String> lines = Files.readAllLines(p);
        String r = new String();
        for (int i = 0; i < lines.size() - 1; i++) {
            String s = lines.get(i);
            ArrayList<Character> c = new ArrayList<>();
            //splits the string into chat array
            for (int j = 0; j < s.length(); j+=2) {
                c.add(s.charAt(j));
            }
            for (char d :
                    c) {
                r += d;
            }
            r += " ";
        }
        return r;
    }

}