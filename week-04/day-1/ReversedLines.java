import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        String path = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/reversed-lines.txt";

        try {
            System.out.println(reveresedLines(path));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static String reveresedLines(String path) throws IOException {
        Path p = Paths.get(path);
        List<String> lines = Files.readAllLines(p);
        String r = new String();
        for (int i = 0; i < lines.size() - 1; i++) {
            String s = lines.get(i);
            for (int j = 0; j < s.length(); j++) {
                r += s.charAt(s.length() - 1 - j);
            }
            r+= " ";
        }
        return r;
    }
}