import java.util.Random;
import java.util.Scanner;
public class Lesson_5_GuessGame {
    public static void main(String[] args) {
        //System.out.println("test git");

        Random random = new Random();
        System.out.println("Угодай число от 0 до 10, у тебя 3 попытки.");
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * 10 );

        for (int i = 0; i <= 2; i++) {
            int in = scanner.nextInt();
            if (in == num) {
                System.out.println("Верно");
                break;
            } else {
                System.out.println("Не верно");



            }
        }}}
