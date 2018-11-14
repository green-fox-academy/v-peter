package pirates;

import java.util.ArrayList;
import java.util.Iterator;

public class Armada {
    String name;
    ArrayList<Ship> shipList;
    ArrayList<String> shipNameList;

    public Armada(String name) {
        int r = (int) (Math.random() * 5);
        shipList = new ArrayList<>();
        shipNameList = new ArrayList<>();
        this.name = name;
        String[] shipNameArray = {"Bounty", "Pequod", "Admiral Ushakov", "Alabama", "Santa Maria", "Schleswig-Holstein", "São Paulo", "Suwo", "Rákóczi", "Vérité", "Vasco da Gama"};
        for (int i = 0 + r; i < shipNameArray.length - r; i++) {
            shipNameList.add(shipNameArray[i]);
        }
        this.shipList = new ArrayList<Ship>();
//tehere was an exception here, if I tried to randomize the limit of the for loop
        for (int i = 0; i < shipNameList.size(); i++) {
            shipList.add(new Ship(shipNameList.get(i)));
        }
    }

    boolean war(Armada otherArmada) {
        final String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        System.out.println(ANSI_RED + "War began between " + this.name + " and " + otherArmada.name + "." + ANSI_RESET);
//        int n;
//        int n1 = this.shipList.size();
//        int n2 = otherArmada.shipList.size();
//        n = n1 > n2 ? n1 : n2;
        //   Iterator<Ship> i1 = this.shipList.listIterator();
        //   Iterator<Ship> i2 = otherArmada.shipList.listIterator();
        int i = 0;
        int j = 0;
        while (!shipList.isEmpty() && !otherArmada.shipList.isEmpty()) {
            //  Ship s1 = i1.next();
            //  Ship s2 = i2.next();
            //if (i > shipList.size()) i = 0;
            //if (j > otherArmada.shipList.size()) j = 0;
            Ship s1 = shipList.get(i);
            Ship s2 = otherArmada.shipList.get(j);
            // if (s1.battle(s2)) i2.remove();
            if (s1.battle(s2)) {
                otherArmada.shipList.remove(j);
            } else if (s1.calculateScore() == s2.calculateScore()) {
                shipList.remove(i);
                otherArmada.shipList.remove(j);
            } else {
                shipList.remove(i);
            }
        }
        if (!shipList.isEmpty()) {
            System.out.println("Winner captain: "+shipList.get(0).pirates.get(shipList.get(0).getCaptainIndex()).name+" drank "+shipList.get(0).pirates.get(shipList.get(0).getCaptainIndex()).rumDrinked+" rums.");
            return true;          
            
        }
        System.out.println("Winner captain: "+otherArmada.shipList.get(0).pirates.get(otherArmada.shipList.get(0).getCaptainIndex()).name+"drunk "+otherArmada.shipList.get(0).pirates.get(otherArmada.shipList.get(0).getCaptainIndex()).rumDrinked+" rums.");
        return false;
    }
}
