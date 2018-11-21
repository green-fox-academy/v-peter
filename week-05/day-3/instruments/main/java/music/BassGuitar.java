package instruments.main.java.music;

public class BassGuitar extends StringedInstrument{
  String sound;


  public BassGuitar() {
    numberOfStrings = 4;
    sound = "Duum-duum-duum";
    name = "Electric Guitar";
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    sound = "Duum-duum-duum";
    name = "Electric Guitar";
  }
  @Override
  String sound() {
    return sound;
  }
}
