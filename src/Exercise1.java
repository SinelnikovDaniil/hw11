import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите СНИЛС в формате ДДД-ДДД-ДДД ДД:");
        String snils = input.nextLine();

        if (snils.matches("\\d{3}-\\d{3}-\\d{3} \\d{2}")) {
            System.out.println("СНИЛС введен корректно.");
        } else {
            System.out.println("Вы ввели некорректный СНИЛС.");
        }
    }
}
