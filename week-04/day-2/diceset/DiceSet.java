package diceset;

public class DiceSet {
    // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
    static int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    public void printSet() {
        for (int i = 0; i < dices.length; i++) {
            System.out.print(dices[i] + " ");
        }
        System.out.println();
    }

    static boolean checkIfAllSix() {
        boolean b = true;
        for (int i = 0; i < dices.length; i++) {
            if (dices[i] != 6) b = false;
        }
        return b;
    }

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        diceSet.printSet();
        while(!checkIfAllSix())
        while(!checkIfAllSix())
            diceSet.reroll();
        diceSet.printSet();


    }
}
