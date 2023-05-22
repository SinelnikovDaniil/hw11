import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = input.nextLine();

        // Если длина строки больше 10
        if (str.length() > 10) {
            str = str.substring(0, 6); // оставляем только первые 6 символов
        }
        // Иначе
        else {
            while (str.length() < 12) {
                str += 'о'; // дополняем строку символами 'о' до длины 12
            }
        }

        System.out.println("Итоговая строка: " + str);
    }
}
