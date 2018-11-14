package pirates;

public class WarApp {
    public static void main(String[] args) {
        Armada a1 = new Armada("Alliance");
        Armada a2 = new Armada("Axis");
        String winner = new String();
        String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";

        if (a1.war(a2)) winner = a1.name;
        else winner = a2.name;
        System.out.println(ANSI_RED + winner + " won the war." + ANSI_RESET);
    }
}