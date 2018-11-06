import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<Integer, String> daysOfTheWeek = new HashMap<>();

        daysOfTheWeek.put(1, "Monday");
        daysOfTheWeek.put(2, "Tuesday");
        daysOfTheWeek.put(3, "Wednesday");
        daysOfTheWeek.put(4, "Thursday");
        daysOfTheWeek.put(5, "Friday");
        daysOfTheWeek.put(6, "Saturday");
        daysOfTheWeek.put(7, "Sunday");

        System.out.println(daysOfTheWeek.get(2));

        HashMap<String, String> engHunDictionary = new HashMap<>();
        engHunDictionary.put("alma", "apple");
        engHunDictionary.put("korte", "pear");
        engHunDictionary.put("narancs", "orange");
        engHunDictionary.put("korte", "pir");
        engHunDictionary.put("kortee", "pir");

        System.out.println(engHunDictionary.values());


        int[] isItUnique = {1,2,3,4,4,5,6,7,7,8,9};


    }
}