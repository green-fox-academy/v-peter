package instruments.main.java.music;

public class Violin extends StringedInstrument{
  String sound;

  public Violin() {
    numberOfStrings = 4;
    sound = "Screech";
    name = "Violin";
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    sound = "Screech";
    name = "Violin";

  }
  @Override
  String sound() {
    return sound;
  }
}
