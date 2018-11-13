package pokemon;

public class Pokemon {
    String name;
    String type;

    String isEffectiveAgainst(){
        String enemy = new String();
        if (type == "water") enemy = "fire";
        else if (type == "fire") enemy = "water";
        else if (type == "wild") enemy = "tame";
        else if(type == "tame") enemy = "wild";
        if (!enemy.isEmpty()) return "The "+type+" pokemon's enemy is: "+enemy;
        else return "This kind of pokemon doesn't have effective enemy.";
    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Pokemon(String type) {
        this.type = type;
    }
}
