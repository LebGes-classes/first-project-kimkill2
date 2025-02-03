import java.util.Scanner;
public class Player {
    public static int[] move(String[][] arrMatrix, int[] arrPlayerPos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите команду движения: ");
        String moveCommand = sc.nextLine();

        switch (moveCommand) {
            case "w":
                if (arrMatrix[arrPlayerPos[1] - 1][arrPlayerPos[0]].equals("#")) {
                    System.out.println("не-не-не, тут стена, ищи другой путь :)");
                } else {
                    arrPlayerPos[1] = arrPlayerPos[1] - 1;
                }
                break;
            case "s":
                if (arrMatrix[arrPlayerPos[1] + 1][arrPlayerPos[0]].equals("#")) {
                    System.out.println("не-не-не, тут стена, ищи другой путь :)");
                } else {
                    arrPlayerPos[1] = arrPlayerPos[1] + 1;
                }
                break;
            case "a":
                if (arrMatrix[arrPlayerPos[1]][arrPlayerPos[0] - 1].equals("#")) {
                    System.out.println("не-не-не, тут стена, ищи другой путь :)");
                } else {
                    arrPlayerPos[0] = arrPlayerPos[0] - 1;
                }
                break;
            case "d":
                if (arrMatrix[arrPlayerPos[1]][arrPlayerPos[0] + 1].equals("#")) {
                    System.out.println("не-не-не, тут стена, ищи другой путь :)");
                } else {
                    arrPlayerPos[0] = arrPlayerPos[0] + 1;
                }
                break;
            default:
                System.out.println("Такой команды движения нет");

        }
        return arrPlayerPos;
    }
}
