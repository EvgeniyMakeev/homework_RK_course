package firstLesson;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
Написать программу, которая считывает слова в консоли, одно за
одним, разделенные переносом строки (Enter). Окончание ввода -
пустая строка.
Найти количество уникальных слов.
В каждом из слов найти количество уникальных символов.
 */

public class CounterOfUniqueSymbols {
    public static void main(String[] args) {
        Set<String> wordSet = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in)){
            String s = null;
            while (!(s = scanner.nextLine()).isEmpty()) {
                wordSet.add(s);
            }
        }
        for (String word : wordSet) {
            printWordUniqueCharsCount(word);
        }
    }

    private static void printWordUniqueCharsCount(String word) {
        Set<Character> symbolChars = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            Character currentChar = word.charAt(i);
            symbolChars.add(currentChar);
        }

        System.out.println(word + " -> " + symbolChars.size());
    }
}
