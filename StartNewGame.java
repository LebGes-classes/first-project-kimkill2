import java.util.Scanner;

public class StartNewGame {
    public static void startNewGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер уровня?(1-3): ");
        int lvlNumber = sc.nextInt();
        LvlChooser.chooserLVL(lvlNumber);
    }
}
