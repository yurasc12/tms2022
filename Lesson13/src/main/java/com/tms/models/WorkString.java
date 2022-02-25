package com.tms.models;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class WorkString {


    //Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
    public String cutString(String str, char simpleOne, char simpleTwo) {
        if (str != null && str.length() > 1) {
            int positionOne = str.indexOf(simpleOne);
            if (positionOne != -1) {
                int positionTow = str.lastIndexOf(simpleTwo);
                if (positionTow != -1) {
                    if (positionTow < positionOne) {
                        int temp = positionOne;
                        positionOne = positionTow;
                        positionTow = temp;
                    }
                    return str.substring(positionOne, positionTow + 1);
                } else return null;
            } else {
                return null;
            }
        }
        return null;
    }

    // Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0

    public String replaceString(String str, int soursPosition, int receiverPosition) {
        if (str != null && str.length() > 1) {
            if (soursPosition != receiverPosition & str.length() > soursPosition && str.length() > receiverPosition) {
                char soursChar = str.charAt(soursPosition);
                char receiverChar = str.charAt(receiverPosition);
                return str.replace(soursChar, receiverChar);
            } else {
                return null;
            }
        }
        return null;
    }

    // В массиве находятся слова. Вывести на экран слова палиндромы
    // (т.е которые читаются справа на лево и слева на право одинаково, например: заказ, казак, дед...)
    public List<String> getPalindrome(String[] WordArray) {
        List<String> strings = new ArrayList<>();
        if (WordArray != null && WordArray.length > 0) {
            for (String word : WordArray) {
                if (checkWordPalindrome(word)) {
                    strings.add(word);
                }
            }
            return strings;
        }
        return null;
    }

    private boolean checkWordPalindrome(String word) {
        if (StringUtils.isNotEmpty(word) && word.length() > 1) { // предлоги и союзы не палиндромы
            StringBuilder stringBuilder = new StringBuilder(word.toLowerCase(Locale.ROOT));
            String wordTemp = stringBuilder.reverse().toString();
            return word.toLowerCase(Locale.ROOT).equals(wordTemp);
        } else {
            return false;
        }
    }

    //    4) Есть строка в которой содержится текст, предложения разделены точками.
    //  После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-ти слов.
    //  Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится на экран.
    public List<String> parseText(String text) {
        if (StringUtils.isNotEmpty(text)) {
            List<String> stringList = new ArrayList<>();
            String[] sentences = text.split("\\.");
            for (String sentence : sentences) {
                if (checkSentence(sentence.trim())) {
                    stringList.add(sentence.trim());
                }
            }
            return stringList;
        }
        return null;
    }

    private boolean checkSentence(String sentence) {
        String[] wordArray = sentence.split("[,; ]+");
        if (wordArray.length >= 3 && wordArray.length <= 5) {
            return true;
        } else {
            for (String s : wordArray) {
                if (checkWordPalindrome(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    //5)Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
    // Пример: "string" → "ri", "code" → "od", "Practice"→"ct".
    public String getMidlChar(String word) {
        if (StringUtils.isNotEmpty(word) && word.length() % 2 == 0) {
            if (word.length() == 2) {
                return word;
            } else {
                int positionFrom = word.length() / 2 - 1;
                return word.substring(positionFrom, positionFrom + 2);
            }
        } else {
            return null;
        }
    }

    //Найти количество слов, содержащих только символы латинского алфавита. Пример:
    // "Методы доступа называют ещё аксессорами (от англ. access — доступ), или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)"
    //
    public int getCountWordLatinCharacters(String text) {
        if (StringUtils.isNotEmpty(text)) {
            List<String> stringList = new ArrayList<>();
            String[] words = text.split("[.,; ]+");
            int countWord = 0;
            for (String word : words) {
                if (checkWordLatinChar(word)) {
                    countWord++;
                }
            }
            return countWord;
        }
        return 0;
    }

    private boolean checkWordLatinChar(String word) {
        char[] chars = word.toLowerCase(Locale.ROOT).toCharArray();
        boolean isLatin = true;
        for (char aChar : chars) {
            if ((int) aChar < 97 || (int) aChar > 122) {
                isLatin = false;
                break;
            }
        }
        return isLatin;
    }

}
