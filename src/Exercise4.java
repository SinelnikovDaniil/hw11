import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = input.nextLine();

        char lastChar = str.charAt(str.length() - 1);

        System.out.println("Номера символов, совпадающих с последним символом строки (" + lastChar + "):");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == lastChar) {
                System.out.print(i + " ");
            }
        }
    }
}
