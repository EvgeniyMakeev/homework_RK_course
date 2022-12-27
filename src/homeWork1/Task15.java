package homeWork1;

/**
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */

public class Task15 {
    public static void main(String[] args) {
        int size = 5;
        int[][] arr = new int[size][size];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
