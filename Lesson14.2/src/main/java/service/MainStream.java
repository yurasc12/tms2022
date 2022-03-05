package service;

import utils.StringUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainStream {
    public static final String DIRNAME = "Lesson14.2/src/main/resources/";

    public static void main(String[] args) {

        String pathInput = DIRNAME + "input.txt";
        String pathOutput = DIRNAME + "output.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(pathInput), StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathOutput)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (StringUtils.checkWordPalindrome(line)) {
                    writer.write(line + "\n");
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String pathInput1 = DIRNAME + "input2.txt";
        String pathOutput1 = DIRNAME + "output2.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(pathInput1), StandardCharsets.UTF_8));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathOutput1)))) {

            String line;

            String[] split = readLine(reader);

            for (String s : split) {
                int countWords = StringUtils.checkSentence(s);
                if ((countWords >= 3 && countWords <= 5) | StringUtils.checkSentencePalindrome(s)) {
                    writer.write(s + "\n");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        String pathInputSours = DIRNAME + "sours.txt";
        String pathInputBlackList = DIRNAME + "blacklist.txt";
        try (BufferedReader readerSours = new BufferedReader(new InputStreamReader(new FileInputStream(pathInputSours), StandardCharsets.UTF_8));
             BufferedReader readerBlackList = new BufferedReader(new InputStreamReader(new FileInputStream(pathInputBlackList), StandardCharsets.UTF_8))) {

            String[] soursStrings = readLine(readerSours);
            String[] blackWords = readLine(readerBlackList);
            List<String> sentence = new ArrayList<>();
            for (String blackWord : blackWords) {
                for (String soursString : soursStrings) {
                    if (soursString.toLowerCase(Locale.ROOT).contains(blackWord.toLowerCase(Locale.ROOT))) {
                        sentence.add(soursString);
                    }
                }
            }
            if (sentence.size() > 0) {
                System.out.println("Текст не прошел цензуру !!!");
                System.out.println("Количество предложений " + sentence.size());
                System.out.println();
                for (String s : sentence) {
                    System.out.println(s);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static String[] readLine(BufferedReader reader) throws IOException {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString().split("[.?!]");
    }


}
