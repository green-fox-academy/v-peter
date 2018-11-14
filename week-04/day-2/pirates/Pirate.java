package pirates;

public class Pirate {
    String name;
    int rumDrinked;
    boolean lives = true;
    boolean isCaptain;

    public Pirate(String name, boolean isCaptain, int rumDrinked) {
        this.name = name;
        this.isCaptain = isCaptain;
        this.rumDrinked = rumDrinked;
    }

    void drinkSomeRum(){
        if (lives == true) {
           int n = (int) (Math.random() * 3) + 1;
           rumDrinked += n;
            System.out.println(name+" just drank "+n+" rum(s).");
        } else System.out.println("he's dead");
    }

    String howsItGoingMate(){
        if(lives == true) {
            if (rumDrinked <= 4) return "Pour me anudder!";
            else return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }
        else {
            return "he's dead";
        }
    }

    void die(){
        lives = false;
        System.out.println(name+" is dead.");
    }

void brawl(Pirate p){
        if (p.lives == false) System.out.println(p.name+" is dead. You can't fight a dead.");
        else {
            int r = (int) (Math.random() * 3);
            switch (r){
                case 0: lives = false;
                case 1: p.lives = false;
                case 2: {
                    lives = false;
                    p.lives = false;
                }
            }
        }
}











}
