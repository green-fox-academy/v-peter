import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        Path p = Paths.get("C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/my-file.txt");

        try {
            List<String> lines = Files.readAllLines(p);
            for (String l: lines) {
                System.out.println(l);
            }
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}