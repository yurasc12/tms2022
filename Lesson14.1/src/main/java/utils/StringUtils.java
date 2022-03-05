package utils;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;
import static utils.Constants.PATERN;

@UtilityClass
public class StringUtils {
    /**
     * По строкам дополнительная!
     * 1) Даны строки разной длины c четным числом символов(казаки, просмотреть и так далее),
     * необходимо вернуть ее два средних знака.
     * Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".
     */

    public static String getMidlChar(String word) {
        if (isNotEmpty(word) && word.length() % 2 == 0) {
            if (word.length() == 2) {
                return word;
            } else {
                int positionFrom = word.length() / 2 - 1;
                return word.substring(positionFrom, positionFrom + 2);
            }
        }
        return null;
    }
//По  регулярным выражениям!
//     * 2) Дана строка "cab, ccab, cccab" Необходимо составить регулярное выражение, сделать класс Pattern, Matcher, вызвать метод find и вывести слова на консоль
//     * Должно вывести:
//     * cab
//     * ccab
//     * cccab
// Дана строка "Versions: Java  5, Java 6, Java   7, Java 8, Java 12."  Найти все подстроки "Java X", где X - число и распечатать их.

    public static List<String> getWord(String str, String regex) {
        // String regex = "Java\\s+\\d{1,3}";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(str);
        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }


    /**
     * 4*)со звездочкой! Предложение состоит из нескольких слов, разделенных пробелами. Например: "One two three раз два три one1 two2 123 ".
     * Найти количество слов, содержащих только символы латинского алфавита.
     * Необходимо составить регулярное выражение и вызвать его в методе split(Regexp)
     * String str = "One two three раз два три one1 two2 123 ";
     * System.out.println(str.split("регулярное выражение").length);
     * Подсказка: тут надо использовать:
     * 1) группы ()
     * 2) | - оператор или
     * 3) [] - группировки символов
     * 4) +,* - квантификаторы
     */
// пока не  придумал
    public static void getCountWord(String str) {
        String regex = "[[^a-zA-Z]\\s+]";
        String[] words = str.split(regex);
        System.out.println(str.split(regex).length);
    }

    /**
     * Необходимо выполнить проверку на валидацию входящей строки и вернуть false или true
     * - Строка должна содержать только маленькие латинские буквы и цифры 1 или 5 без знака подчеркивания.
     * - Длина строки должна быть от 4 до 20 символов.
     */
    public static boolean validate(String str) {
        Matcher matcher = PATERN.matcher(str);
        return matcher.matches();
    }

    public static boolean checkWordPalindrome(String word) {
        if (isNotEmpty(word) && word.length() > 1) { // предлоги и союзы не палиндромы
            StringBuilder stringBuilder = new StringBuilder(word.toLowerCase(Locale.ROOT));
            String wordTemp = stringBuilder.reverse().toString();
            return word.toLowerCase(Locale.ROOT).equals(wordTemp);
        } else {
            return false;
        }
    }

    public static int checkSentence(String sentence) {
        String[] wordArray = sentence.trim().split("[,; ]+");
        return wordArray.length;
    }

    public static boolean checkSentencePalindrome(String sentence) {
        String[] wordArray = sentence.trim().split("[,; ]+");
        for (String s : wordArray) {
            if (checkWordPalindrome(s)) {
                return true;
            }
        }
        return false;
    }


}
