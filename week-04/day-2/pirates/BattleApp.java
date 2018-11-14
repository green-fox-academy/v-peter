package pirates;

public class BattleApp {
    public static void main(String[] args){
        Ship s1 = new Ship("Bounty");
        Ship s2 = new Ship("Pequod");

        s1.fillShip();
        s2.fillShip();

        System.out.println(s1);
        System.out.println(s2);

        s1.battle(s2);

        System.out.println(s1);
        System.out.println(s2);
    }
}
