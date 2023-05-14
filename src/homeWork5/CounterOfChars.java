package homeWork5;

import java.util.Objects;

/**
 * Задание 18
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 * общее их количество.
 * Задание 19
 * Имееться строка с текстом. Подсчитать количество слов в тексте. Желательно
 * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать.
 * Задание 20
 * Имеется строка с текстом. Вывести текст, составленный из последних букв
 * всех слов.
 */

public class CounterOfChars {
    public static void main(String[] args) {
        String str = "Строковый литерал — это последовательность символов, заключенных в двойные кавычки.";
        System.out.println("Исходная строка - \"" + str + "\"");
        int n = 0;
        char symbol;
        for(int i = 0; i < str.length(); i++){
            symbol = str.charAt(i);
            if(symbol == ',' || symbol == '.' || symbol == '—') {
                n++;
            }
        }
        System.out.println("У нас есть " + n + " знаков препинания.");
        String[] words = str.split(" ");
        int notWords = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            if (Objects.equals(word, ",") || Objects.equals(word, ".") || Objects.equals(word, "—")) {
                notWords++;
            } else {
                if (word.endsWith(",") || word.endsWith(".")) {
                    stringBuilder.append(word.charAt(word.length() - 2));
                } else {
                    stringBuilder.append(word.charAt(word.length() - 1));
                }
            }
        }
        int result = words.length - notWords;
        System.out.println("Количество слов в тексте - " + result);
        System.out.println("Строка составленная из последних букв всех слов - \"" + stringBuilder + "\"");
    }
}
