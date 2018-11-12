import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String s1 = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/my-file.txt";
        String s2 = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/my-file2.txt";
        copyFile(s1, s2);

    }

    static boolean copyFile(String s1, String s2) {

        Path p1 = Paths.get(s1);
        Path p2 = Paths.get(s2);

        try {
            Files.write(p2, Files.readAllLines(p1));
            return true;
        } catch (
                IOException e) {
            System.out.println("Try again");
            return false;
        } catch (Exception e) {
            System.out.println("error");
            return false;
        }

    }

}