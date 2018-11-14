package pirates;

import java.util.ArrayList;
import java.util.Iterator;

public class Ship {
    String name;
    ArrayList<Pirate> pirates;

    public Ship(String name) {
        this.name = name;
        this.pirates = new ArrayList<>();
        fillShip();
    }

    void fillShip() {

        String[] nameList = {"Alfred", "Bill", "Charles", "Dave", "Elliot", "Freddy", "Greg", "Harley", "Ian", "Jack", "Mike"};
        for (int i = 0; i < (int) (Math.random() * 10) + 5; i++) {
            pirates.add(new Pirate(nameList[(int) (Math.random() * nameList.length)], false, (int) (Math.random()*5) +1));
        }
        pirates.add(new Pirate(nameList[(int) (Math.random() * nameList.length)], true, (int) (Math.random()*2) +1));
    }

    int getCaptainIndex() {
        int i = -1;
        for (Pirate p :
                pirates) {
            if (p.isCaptain) i = pirates.indexOf(p);
        }
        return i;
    }

    int captainsConsumedRums() {
        return pirates.get(getCaptainIndex()).rumDrinked;
    }

    boolean captainIsDead() {
        if (pirates.get(getCaptainIndex()).lives == false) return true;
        else return false;
    }

    boolean captainIsPassedOut() {
        if (pirates.get(getCaptainIndex()).rumDrinked > 4) return true;
        else return false;
    }

    int numberOfAlivedPirates() {
        int n = 0;
        for (Pirate p :
                pirates) {
            if (pirates.indexOf(p) != getCaptainIndex() && p.lives) n++;
        }
        return n;
    }

    boolean battle(Ship otherShip) {
        String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_GREEN+"Battle begins between "+name+" and "+otherShip.name+"."+ANSI_RESET);
        if (this.calculateScore() > otherShip.calculateScore()) {
            System.out.println(ANSI_GREEN+"Ship "+name+" won."+ANSI_RESET);
            otherShip.lose();
            win();
            return true;
        } else if (this.calculateScore() < otherShip.calculateScore()) {
            System.out.println(ANSI_GREEN+"Ship "+otherShip.name+" won."+ANSI_RESET);
            lose();
            otherShip.win();
            return false;
        }
        else {
            System.out.println(ANSI_GREEN+"The battle ended in draw."+ANSI_RESET);
            lose();
            otherShip.lose();
            return false;
        }
    }

    void win() {
        for (Pirate p :
                pirates) {
            p.drinkSomeRum();
        }
    }

    void lose() {
        //how many pirates got dead in te battle
        int n = (int) (Math.random() * pirates.size()) + 1;
        //indexes of pirate list to a list
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < pirates.size(); i++) {
            indexList.add(i);
        }
        //choose n random index from the list
        ArrayList<Integer> chosen = new ArrayList<>();
        Iterator<Integer> i = indexList.listIterator();
        for (int j = 0; j < n; j++) {
            int r = (int) (Math.random() * pirates.size());
            if (!chosen.contains(r)) chosen.add(r);
            else n--;
        }
        //kills n numbers of pirates
        for (Integer ch :
                chosen) {
            pirates.get(ch).die();
        }

    }

    int calculateScore() {
        int n = numberOfAlivedPirates() - captainsConsumedRums();
        return n;
    }

    @Override
    public String toString() {
        String s = "Ship " + name + "'s captain ("+pirates.get(getCaptainIndex()).name+") consumed " + captainsConsumedRums() + " rums.";
        if (captainIsDead()) s += " He's dead.";
        else s += " He's alive.";
        if (!captainIsDead() && captainIsPassedOut()) s += " He's passed out.";
        s += "\nThere are " + numberOfAlivedPirates() + " living pirates on board.";
        return s;
    }

}
