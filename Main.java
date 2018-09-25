import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String language = chooseALanguage();
        System.out.println("----------------  "+greet(language)+"  ----------------");

    }

    public static String chooseALanguage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your language, for example: Polish, English, Czech");

        String scan = scanner.next();
        return scan;
    }

    public static String greet(String language) {
        language = language.toLowerCase();
        HashMap<String, String> map = new HashMap<>();

        map.put("polish", "Witamy!");
        map.put("english", "Welcome!");
        map.put("czech", "Vitejte!");
        map.put("danish", "Velkomst!");
        map.put("dutch", "Welkom!");
        map.put("estonian", "Tere tulemast!");
        map.put("finnish", "Tervetuloa!");
        map.put("flemish", "Welgekomen!");
        map.put("french", "Bienvenue!");
        map.put("german", "Willkommen!");
        map.put("irish", "Failte!");
        map.put("italian", "Benvenuto!");
        map.put("latvian", "Gaidits!");
        map.put("lithuanian", "Laukiamas!");
        map.put("spanish", "Bienvenido!");
        map.put("swedish", "Valkommen!");
        map.put("welsh", "Croeso!");

        return  map.getOrDefault(language, map.get("english"));

    }
}
