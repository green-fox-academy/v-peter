import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        String path = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/reversed-lines.txt";
        String newPath = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/reversed-lines-decrypted.txt";

        try {
            System.out.println(reveresedLines(path, newPath));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static String reveresedLines(String path, String newPath) throws IOException {
        Path p = Paths.get(path);
        Path pNew = Paths.get(newPath);
        List<String> lines = Files.readAllLines(p);
        String r = new String();
       String newSring = new String();
        List<String> lines2 = new ArrayList<>();
        for (int i = 0; i < lines.size() - 1; i++) {
            String s = lines.get(i);
            newSring = "";
            for (int j = 0; j < s.length(); j++) {
                r += s.charAt(s.length() - 1 - j);
                newSring += s.charAt(s.length() - 1 - j);
            }
            r+= "\n";
            lines2.add(newSring);
        }
        Files.write(pNew, lines2);

        return r;
    }
}