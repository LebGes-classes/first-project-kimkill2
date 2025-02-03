import java.util.Random;
import java.util.Scanner;

public class Field {
    public static void Gamefield(String[][] matrix, int[] arrPlayerPos) {
        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j]);

                }
                System.out.println();
            }


            matrix[arrPlayerPos[1]][arrPlayerPos[0]] = " ";

            Player.move(matrix, arrPlayerPos);

            if (matrix[arrPlayerPos[1]][arrPlayerPos[0]].equals("F")) {
                System.out.println("Поздравляем, вы прошли лабиринт");
                System.out.println("Желаете перейти на следующий уровень Y/N? ");
                String answer = sc.nextLine();
                if (answer.equals("N")) {
                    flag = false;
                    Menu.openMenu();
                }
                if (answer.equals("Y")) {
                    StartNewGame.startNewGame();
                }


            }

            matrix[arrPlayerPos[1]][arrPlayerPos[0]] = "*";

        }
    }
}