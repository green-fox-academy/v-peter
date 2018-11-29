package todo;

import javafx.beans.value.ObservableBooleanValue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String fileName = "todo.txt";
    String path = "C:" + File.separator + "Users" + File.separator + "Peter" + File.separator + "IdeaProjects" + File.separator +
        "Todo" + File.separator + "src" + File.separator + fileName;
    File f = new File(path);
    Scanner sc = new Scanner(System.in);
    Path todoFile = Paths.get(path);
    createFile(f, todoFile);

    int n = 0;
    do {
      printStart();
      String start = sc.nextLine();
      switch (start) {
        case "-l":
          try {
            List<String> lines = Files.readAllLines(todoFile);
            for (int i = 0; i < lines.size(); i++) {
              System.out.println(i + 1 + " - " + lines.get(i));
            }
          } catch (IOException e) {
            System.out.println("Empty list");
            System.out.println("Unable to read file: " + fileName);
          }
          break;
        case "-a":
          String newTask;
          do {
            System.out.println("Input new task:");
            System.out.println("Save and exit: -s");
            newTask = sc.nextLine();
            List<String> lines = new ArrayList<>();
            if(!newTask.equals("-s")) lines.add(newTask);
            try {
              Files.write(todoFile, lines, StandardOpenOption.APPEND);
            } catch (IOException e) {
              e.printStackTrace();
            }
          } while (!newTask.equals("-s"));
          break;
        case "-q":
          System.exit(0);
      }
    } while (n == 0);
  }

  public static void createFile(File f, Path p) {
    try {
      if (f.createNewFile()) {
        System.out.println(p + " File Created");
      } else System.out.println("File " + p + " already exists");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void printStart() {
    System.out.println("Command Line Todo application");
    System.out.println("=============================");
    System.out.println("Type in what to do:");
    System.out.println(" -l   Lists all the tasks");
    System.out.println(" -a   Adds a new task");
//    System.out.println(" -r   Removes a task");
//    System.out.println(" -c   Completes a task");
    System.out.println(" -q   Exit program");
  }

}
