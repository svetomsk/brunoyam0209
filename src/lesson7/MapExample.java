package lesson7;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Long> nameToNumber = new HashMap<>();
        nameToNumber.put("Svetozar", 523232L);
        nameToNumber.put("Ivan", 123456L);
        nameToNumber.put("Petr", 649274L);
        nameToNumber.put("Olga", 923765L);
        System.out.println(nameToNumber);
        Long oldValue = nameToNumber.put("Ivan", 432134L);
        System.out.println("Old value: " + oldValue);
        nameToNumber.putIfAbsent("Ivan", 777777L);
        nameToNumber.putIfAbsent("Ivan IV", 777777L);
        System.out.println(nameToNumber);

        Long petrNumber = nameToNumber.get("Petr");
        System.out.println("Petr number: " + petrNumber);
        Long unknownNumber = nameToNumber.get("Elizaveta II");
        System.out.println("Unknown number: " + unknownNumber);
        unknownNumber = nameToNumber.getOrDefault("Elizaveta II", 0L);
        System.out.println("Default value: " + unknownNumber);

        System.out.println(nameToNumber.size());
        System.out.println(nameToNumber.keySet());
        System.out.println(nameToNumber.values());
        System.out.println(nameToNumber.containsKey("Petr I"));

        nameToNumber.remove("Ivan");
        System.out.println(nameToNumber);
    }
}
