package pirates;

public class BattleApp {
    public static void main(){
        Ship s1 = new Ship("Bounty");
        Ship s2 = new Ship("Pequod");

        s1.fillShip();
        s2.fillShip();

        for (int i = 0; i < s1.pirates.size(); i++) {
            System.out.println("How is it going "+s1.pirates.get(i).name+"?");
            System.out.println(s1.pirates.get(i).howsItGoingMate());
        }

        System.out.println(s1);
        System.out.println(s2);

        s1.battle(s2);

        System.out.println(s1);
        System.out.println(s2);
    }
}
