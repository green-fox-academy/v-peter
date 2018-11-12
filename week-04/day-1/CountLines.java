import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        System.out.println(countLines("C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/my-file.txt"));
        System.out.println(countLines("jaj.txt"));


    }

    public static int countLines (String fileName){
        Path p = Paths.get(fileName);

        try{
            int count = 0;
            List<String> lines = Files.readAllLines(p);
            for (String s :
                    lines) {
                count++;
            }
            return count;
        } catch (IOException e) {
            return 0;
        }

    }
}