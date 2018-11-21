package instruments.main.java.music;

public class ElectricGuitar extends StringedInstrument {
  String sound;


  public ElectricGuitar() {
    numberOfStrings = 6;
    sound = "Twang";
    name = "Electric Guitar";
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    sound = "Twang";
    name = "Electric Guitar";
  }


  @Override
  String sound() {
    return sound;
  }
}
