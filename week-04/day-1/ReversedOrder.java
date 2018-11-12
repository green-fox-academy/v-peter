import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        String path = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/reversed-order.txt";
        String newPath = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/reversed-order-decrypted.txt";

        try {
            reversedOrder(path, newPath);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void reversedOrder(String path, String newPath) throws IOException {
        Path p1 = Paths.get(path);
        Path p2 = Paths.get(newPath);
        List<String> lines = Files.readAllLines(p1);
        List<String> newLines = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            newLines.add(lines.get(lines.size() - i - 1));
        }
        Files.write(p2, newLines);
    }
}