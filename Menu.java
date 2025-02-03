import java.util.Scanner;

public class Menu {
    public static void openMenu() {
        Scanner sc = new Scanner(System.in);
        String command;
        do {
            System.out.println("Добро пожаловать в Лабиринт");
            System.out.println("1: Начать новую игру");
            System.out.println("2: Правила");
            System.out.println("3: Выход");

            command = sc.nextLine();
            switch (command) {
                case "1":
                    StartNewGame.startNewGame();
                    break;
                case "2":
                    System.out.println("""
                            В данной игре нужно пройти из точки А в точку В.
                             Персонаж обозначен - *
                             Финиш обозначен буквой - F\s
                            w - вверх, s - вниз, a - влево, d - вправо""");
                    System.out.println(" ");
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Такой команды нет");

            }
        }
        while (true);
    }
}
