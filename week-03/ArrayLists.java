import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        list.add("Hello Tiptop");

        list.add("Hello Really");
        list.add("Hello Roboto");
        list.add(1,"Hello roboto");

        list.remove(0);
        list.set(1, "Hello Pebble");
        System.out.println(list);

        System.out.println(list.get(0).compareTo(list.get(2)));

        ArrayList<String> sameAsList = new ArrayList<>();
        sameAsList.addAll(list);


        ArrayList<Object> blabla = new ArrayList<>();

        blabla.add(1);
        blabla.add("dog");

        System.out.println(blabla);

        List<String> anything = Arrays.asList("hello", "hi", "hola");
        ArrayList<String> anyanything = new ArrayList<>(Arrays.asList("one", "two", "three"));


       Integer b = 1;
       Integer c = 2;

        System.out.println(b.hashCode());
        System.out.println(c.hashCode());




    }
}