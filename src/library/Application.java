package library;

/**
 * Алгоритм работы библиотеки:
 * • Выберите действие:
 *
 * ◦ Вывод всех книг. При выборе этого действия, было бы отлично спросить у пользователя в какой сортировке вывести:
 * ▪ по алфавиту (возрастание)
 * ▪ по алфавиту (убывание)
 * ▪ по добавлению(сначала новые, потом более старые)
 * После выбора сортировки, из библиотеки получаете список книг, сортируете их таким образом, как выбрал пользователь и выводите в консоль.
 *
 * ◦ Добавление книги. При выборе этого действия:
 * ▪ пользователь должен ввести из консоли 3 параметра (id, название, жанр).
 * ▪ создаем объект книги (поля заполняются данными введенными пользователем)
 * ▪ добавляем книгу в библиотеку (напоминаю, если в списке книг уже существует книга с таким id, то новая книга не добавляется)
 *
 * ◦ Удаление книги. При выборе этого действия:
 * ▪ пользователь вводит id книги которую нужно удалить
 * ▪ удаляем книгу из магазина
 *
 * ◦ Редактирование книги. При выборе этого действия:
 * ▪ пользователь должен ввести из консоли 3 параметра (id книги для редактирования, новое название, новую жанр).
 * ▪ создаем объект книги (поля заполняются данными введенными пользователем)
 * ▪ редактируем книгу в библиотеке
 *
 * ◦ Выход. При выборе этого действия, работа библиотеки завершается.
 */

import java.util.Scanner;

public class Application {
    public static void run(){
        Scanner input = new Scanner(System.in);
        Library myLibrary = new Library();
        Book one = new Book(25, "Властелин колец", Genre.FANTASY);
        myLibrary.addBook(one);
        boolean stop = false;
        while (!stop) {
            System.out.println("\nВыберете действие:" +
                    "\n1 - Вывод всех книг.\n2 - Добавление книги.\n3 - Удаление книги." +
                    "\n4 - Редактирование книги.\n5 - Выход.");
            int push = input.nextInt();
            switch (push) {
                case 1 -> {
                    System.out.println("\nВыберете сортировку книг:" +
                            "\n1 - По алфавиту(возрастание).\n2 - По алфавиту(убывание)." +
                            "\n3 - По добавлению(сначала новые, потом более старые).");
                    push = input.nextInt();
                    switch (push) {
                        case 1 -> myLibrary.getBooks();
                        case 2 -> myLibrary.getBooksRevers();
                        case 3 -> myLibrary.getBooksLastAdd();
                    }
                }
                case 2 -> add(input, myLibrary);
                case 3 -> {
                    System.out.println("Введите ID книги, которую нужно удалить.");
                    int id = input.nextInt();
                    myLibrary.deleteBook(id);
                }
                case 4 -> edit(input, myLibrary);
                case 5 -> {
                    System.out.println("До встречи!");
                    stop = true;
                }
            }
        }
    }

    private static void add(Scanner input, Library myLibrary) {
        System.out.println("Введите ID новой книги.");
        int id = input.nextInt();
        System.out.println("Введите название новой книги.");
        String title = null;
        if (input.hasNext()) {
            title = input.nextLine();
        }
        System.out.println("Выберите жанр новой книги.\n1 - " + Genre.FANTASY + "\n2 - " + Genre.NOVEL +
                "\n3 - " + Genre.LOVE_STORY + "\n4 - " + Genre.DETECTIVE);
        int pushAdd = input.nextInt();
        Genre genre = switch (pushAdd) {
            case 1 -> Genre.FANTASY;
            case 2 -> Genre.NOVEL;
            case 3 -> Genre.LOVE_STORY;
            case 4 -> Genre.DETECTIVE;
            default -> null;
        };
        myLibrary.addBook(new Book(id, title, genre));
    }

    private static void edit(Scanner input, Library myLibrary) {
        System.out.println("Что вы хотите изменить?\n1 - Только название.\n2 - Только жанр.\n3 - Название и жанр.");
        int push = input.nextInt();
        System.out.println("Введите ID книги, которую хотите редактировать");
        int id = input.nextInt();
        switch (push) {
            case 1:
                System.out.println("Введите новое название книги.");
                String title = input.next();
                myLibrary.editBook(id, title);
                break;
            case 2:
                System.out.println("Выберите новый жанр книги.");
                System.out.println("\n1 - " + Genre.FANTASY + "\n2 - " + Genre.NOVEL +
                        "\n3 - " + Genre.LOVE_STORY + "\n4 - " + Genre.DETECTIVE);
                push = input.nextInt();
                Genre genre = switch (push) {
                    case 1 -> Genre.FANTASY;
                    case 2 -> Genre.NOVEL;
                    case 3 -> Genre.LOVE_STORY;
                    case 4 -> Genre.DETECTIVE;
                    default -> null;
                };
                myLibrary.editBook(id, genre);
                break;
            case 3:
                System.out.println("Введите новое название книги.");
                title = input.next();
                System.out.println("Выберите новый жанр книги.");
                System.out.println("\n1 - " + Genre.FANTASY + "\n2 - " + Genre.NOVEL +
                        "\n3 - " + Genre.LOVE_STORY + "\n4 - " + Genre.DETECTIVE);
                push = input.nextInt();
                genre = null;
                genre = switch (push) {
                    case 1 -> Genre.FANTASY;
                    case 2 -> Genre.NOVEL;
                    case 3 -> Genre.LOVE_STORY;
                    case 4 -> Genre.DETECTIVE;
                    default -> genre;
                };
                myLibrary.editBook(id, title, genre);
                break;
        }
    }
}
