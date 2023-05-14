package firstLesson;

import java.util.HashMap;
import java.util.Map;

/**
 Дана строка. Вычислить, сколько раз каждая буква встречается в
 строке
 Ввод: AAABBACBA
 Вывод: A-5 B-3 C-1
 *Дан массив целых чисел a и число target. Найти пару индексов i и
 j таких, что a[i] + a[j] = target. Если такой пары нет - то вывести
 соответствующее сообщение
 */

public class CounterOfUniqueSymbolsInString {
    public static void main(String[] args) {
        String s = "AAABBACBA";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            Integer currentCharCount = map.getOrDefault(currentChar, 0);
            currentCharCount++;
            map.put(currentChar, currentCharCount);
        }

        System.out.println(map);
    }
}
