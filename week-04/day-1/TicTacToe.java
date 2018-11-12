import java.io.IOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TicTacToe {
    public static void main(String[] args) {
        String path1 = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/draw.tXt";
        String path2 = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/win-o.tXt";
        String path3 = "C:/Users/Peter/IdeaProjects/FilesAndRecursion/src/win-X.tXt";
        System.out.println(ticTacToe(path1));
        System.out.println(ticTacToe(path2));
        System.out.println(ticTacToe(path3));
    }


    static String ticTacToe(String path) {
        Path p = Paths.get(path);
        ArrayList<String> lines = new ArrayList<>();
        String win = new String();
        int c = 3;
        int r = 3;
        try {
            lines = (ArrayList<String>) Files.readAllLines(p);
            for (int i = 0; i < r - 2; i++) {
                for (int j = 0; j < c - 2; j++) {
                    if (lines.get(i).charAt(j) == 'X' && lines.get(i).charAt(j + 1) == 'X' && lines.get(i).charAt(j + 2) == 'X')
                        win = "X";
                    else if (lines.get(i).charAt(j) == 'O' && lines.get(i).charAt(j + 1) == 'O' && lines.get(i).charAt(j + 2) == 'O')
                        win = "O";
                    else if (lines.get(i).charAt(j) == 'X' && lines.get(i + 1).charAt(j) == 'X' && lines.get(i + 2).charAt(j) == 'X')
                        win = "X";
                    else if (lines.get(i).charAt(j) == 'O' && lines.get(i + 1).charAt(j) == 'O' && lines.get(i + 2).charAt(j) == 'O')
                        win = "O";
                    else if (lines.get(i).charAt(j) == 'X' && lines.get(i + 1).charAt(j + 1) == 'X' && lines.get(i + 2).charAt(j + 2) == 'X')
                        win = "X";
                    else if (lines.get(i).charAt(j) == 'O' && lines.get(i + 1).charAt(j + 1) == 'O' && lines.get(i + 2).charAt(j + 2) == 'O')
                        win = "O";
                    else if (lines.get(i).charAt(j + 2) == 'X' && lines.get(i + 1).charAt(j + 1) == 'X' && lines.get(i + 2).charAt(j) == 'X')
                        win = "X";
                    else if (lines.get(i).charAt(j + 2) == 'O' && lines.get(i + 1).charAt(j + 1) == 'O' && lines.get(i + 2).charAt(j) == 'O')
                        win = "O";
                    else win = "draw";
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return win;
    }

   

}