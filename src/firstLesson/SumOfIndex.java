package firstLesson;

import java.util.HashMap;
import java.util.Map;

// Найти индексы чисел в сумме дающие число n

public class SumOfIndex {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 2, 16, 3, 9};
        int n = 16;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] + arr[j] == n){
//                    System.out.println(i + " " + j);
//                    return;
//                }
//            }
//        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int elementToFind = n - arr[i];
            if (map.containsKey(elementToFind)) {
                System.out.println(map.get(elementToFind) + " " + i);
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println("Not found.");
    }
}
