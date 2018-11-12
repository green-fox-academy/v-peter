import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        String path = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/log.txt";
        for (String s :
                logs(path)) {
            System.out.println(s);
        }

        System.out.printf("GET / POST ratio: %.2f", getPostRatio(path));
    }

    static String[] logs(String s) {
        Path p = Paths.get(s);
        int count = 0;
        ArrayList<String> lines = new ArrayList<>();
        try {
            lines = (ArrayList<String>) Files.readAllLines(p);
            for (String string :
                    lines) {
                count++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        String[] t = new String[count];
        for (int i = 0; i < t.length; i++) {
            t[i] = lines.get(i).substring(27, 38);
        }

        return t;
    }

    static double getPostRatio(String s) {
        Path p = Paths.get(s);
        int get = 0;
        int post = 0;
        ArrayList<String> lines = new ArrayList<>();
        try {
            lines = (ArrayList<String>) Files.readAllLines(p);
            for (String string :
                    lines) {
                if (string.contains("GET")) get++;
                else if (string.contains("POST")) post++;

            }
        } catch (IOException e) {
            System.out.println(e);
        }
        double d = (double) get / post;
        return d;
    }

}