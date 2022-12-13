import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i <= 10; i++) {
            int randomNumber = random.nextInt(10);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Вкажіть число від 0 до 10");
            int first = scanner.nextInt();
            if (first == randomNumber) {
                System.out.println("Ви вгадали");
            } else if (randomNumber != first) {
                System.out.println("Спробуйте ще раз");
            }
            System.out.println("Вкажіть друге число");
            int second = scanner.nextInt();
            if (second == randomNumber) {
                System.out.println("Ви вгадали");
            } else if (second != randomNumber) {
                System.out.println("Спробуйте ще раз");
            }
            System.out.println("Вкажіть третє число");
            int third = scanner.nextInt();
            if (third == randomNumber) {
                System.out.println("Ви вгадали");
            } else if (third != randomNumber) {
                System.out.println("Ви програли");
            }
            System.out.println("Було загадане число " + randomNumber);
            break;
        }
    }
}
