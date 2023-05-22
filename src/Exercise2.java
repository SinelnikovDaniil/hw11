import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String str1 = input.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = input.nextLine();

        if (str1.contains(str2)) {
            System.out.printf("\"%s\" является подстрокой \"%s\".", str2, str1);
        } else {
            System.out.printf("\"%s\" не является подстрокой \"%s\".", str2, str1);
        }
    }
}
