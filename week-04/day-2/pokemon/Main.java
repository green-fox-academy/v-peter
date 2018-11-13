package pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("wild");
        System.out.println(p1.isEffectiveAgainst());
        Pokemon p2 = new Pokemon("reaper");
        System.out.println(p2.isEffectiveAgainst());

    }
}
