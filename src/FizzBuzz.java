/**
 * Реализуйте метод fizzBuzz(), который выводит на экран числа в диапазоне от begin ДO end. При этом:
 * • Если число делится без остатка на 3, то вместо него выводится слово Fizz
 * • Если число делится без остатка на 5, то вместо него выводится слово Buzz
 * • Если число делится без остатка и на 3, и на 5, то вместо числа выводится слово FizzBuzz
 * • В остальных случаях выводится само число
 * Метод принимает два параметра (begin и end), определяющих начало и конец диапазона (включительно).
 * Если диапазон пуст (в случае, когда begin > end), TO метод просто ничего не печатает.
 */

public class FizzBuzz {
    public static int begin = 15;
    public static int end = 41;

    public static void main(String[] args) {
        fizzBuzz(begin, end);
    }

    public static void fizzBuzz(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0) {
                System.out.println("Fizz");
            }
            else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
