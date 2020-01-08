package kz.nic.converter;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class KazakhLatinConverter {

    private final Map<String, String> dictionary = new HashMap();

    public KazakhLatinConverter() {
        fillDictionary();
    }

    /**
     * 
     * @param str
     * @return 
     */
    public String convert(String str) {        
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            String currentString = Character.toString(currentChar);
            if (dictionary.containsKey(currentString)) {
                String translatedString = dictionary.get(currentString);
 
                if (Character.isUpperCase(currentChar)) { //Проверяем currentChar написан ли большими буквами
                    boolean toUpperCase = false;  // создаем переменную toUpperCase и присваиваем ей false
                    if (i + 1 < chars.length) { // Если i + 1 < меньше длины chars то входим в условие 
                        char nextChar = chars[i + 1]; // достаем следующую букву
                        if (Character.isUpperCase(nextChar)) { // Проверяем эту букву на то является ли она большой
                            toUpperCase = true; // присваиваем true переменной
                        }

                    } else {
                        toUpperCase = true; // Если не вошли в первое условие, то присваиваем true
                    }
                    if (toUpperCase) {
                        translatedString = translatedString.toUpperCase();  // если toUpperCase true то делаем эту строку большой
                    }
                }

                stringBuilder.append(translatedString);
                continue;
            }
            stringBuilder.append(currentString);
        }
        return stringBuilder.toString();
    }
    
    /**
     * 
     */
    private void fillDictionary() {
        dictionary.put("а", "a");
        dictionary.put("А", "A");
        dictionary.put("ә", "á");
        dictionary.put("Ә", "Á");
        dictionary.put("б", "b");
        dictionary.put("Б", "B");
        dictionary.put("д", "d");
        dictionary.put("Д", "D");
        dictionary.put("е", "e");
        dictionary.put("Е", "E");
        dictionary.put("ё", "ıo");
        dictionary.put("Ё", "IO");
        dictionary.put("ф", "f");
        dictionary.put("Ф", "F");
        dictionary.put("г", "g");
        dictionary.put("Г", "G");
        dictionary.put("ғ", "ǵ");
        dictionary.put("Ғ", "Ǵ");
        dictionary.put("х", "h");
        dictionary.put("Х", "H");
        dictionary.put("һ", "h");
        dictionary.put("Һ", "H");
        dictionary.put("і", "i");
        dictionary.put("І", "I");
        dictionary.put("и", "ı");
        dictionary.put("И", "I");
        dictionary.put("й", "ı");
        dictionary.put("Й", "I");
        dictionary.put("ж", "j");
        dictionary.put("Ж", "J");
        dictionary.put("к", "k");
        dictionary.put("К", "K");
        dictionary.put("л", "l");
        dictionary.put("Л", "L");
        dictionary.put("м", "m");
        dictionary.put("М", "M");
        dictionary.put("н", "n");
        dictionary.put("Н", "N");
        dictionary.put("ң", "ń");
        dictionary.put("Ң", "Ń");
        dictionary.put("о", "o");
        dictionary.put("О", "O");
        dictionary.put("ө", "ó");
        dictionary.put("Ө", "Ó");
        dictionary.put("п", "p");
        dictionary.put("П", "P");
        dictionary.put("қ", "q");
        dictionary.put("Қ", "Q");
        dictionary.put("р", "r");
        dictionary.put("Р", "R");
        dictionary.put("с", "s");
        dictionary.put("С", "S");
        dictionary.put("ш", "sh");
        dictionary.put("Ш", "Sh");
        dictionary.put("ч", "ch");
        dictionary.put("Ч", "Ch");
        dictionary.put("т", "t");
        dictionary.put("Т", "T");
        dictionary.put("ү", "ú");
        dictionary.put("Ү", "Ú");
        dictionary.put("ұ", "u");
        dictionary.put("Ұ", "U");
        dictionary.put("в", "v");
        dictionary.put("В", "V");
        dictionary.put("ы", "y");
        dictionary.put("Ы", "Y");
        dictionary.put("у", "ý");
        dictionary.put("У", "Ý");
        dictionary.put("з", "z");
        dictionary.put("З", "Z");
        dictionary.put("э", "e");
        dictionary.put("Э", "E");
        dictionary.put("ю", "ıý");
        dictionary.put("Ю", "Iý");
        dictionary.put("я", "ıa");
        dictionary.put("Я", "Ia");
        dictionary.put("ь", "");
        dictionary.put("Ь", "");
        dictionary.put("ъ", "");
        dictionary.put("Ъ", "");
        dictionary.put("ц", "ts");
        dictionary.put("Ц", "Ts");
        dictionary.put("щ", "sh");
        dictionary.put("Щ", "Sh");
    }
}
