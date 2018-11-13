package postit;

import java.util.ArrayList;

public class Main {
    //public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        PostIt p1 = new PostIt("orange", "Idea 1", "blue");
        PostIt p2 = new PostIt("pink", "Awesome", "black");
        PostIt p3 = new PostIt("yellow", "Superb!", "green");
       //final String ANSI_BLUE = "\u001B[34m";
        //System.out.println(ANSI_BLUE + p1.text + ANSI_RESET);
    }
}