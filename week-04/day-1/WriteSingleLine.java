import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        String s = "Peter Vadasz";
        try {

            Path filePath = Paths.get("C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/my-file.txt");
            Files.write(filePath, Collections.singleton(s));
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
        catch (Exception e){
            System.out.println("error");
        }


    }
}