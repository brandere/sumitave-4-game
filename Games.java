import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
       

        // arrays
        // the starting array(unsolved sudoku)
        int[][] startArray = { { 9, 0, 0, 6, 4, 0, 0, 0, 3 },
                { 2, 7, 0, 0, 9, 0, 5, 8, 0 },
                { 0, 1, 0, 5, 8, 0, 0, 0, 0 },
                { 0, 9, 0, 0, 0, 0, 7, 0, 0 },
                { 0, 0, 7, 9, 6, 5, 8, 0, 0 },
                { 0, 0, 2, 0, 0, 0, 0, 4, 0 },
                { 0, 0, 0, 0, 5, 3, 0, 6, 0 },
                { 0, 5, 1, 0, 7, 0, 0, 2, 8 },
                { 4, 0, 0, 0, 1, 6, 0, 0, 5 } };
        // the ending array (solved sudoku)
        int[][] endArray = { { 9, 8, 5, 6, 4, 7, 2, 1, 3 },
                { 2, 7, 6, 3, 9, 1, 5, 8, 4 },
                { 3, 1, 4, 5, 8, 2, 6, 9, 7 },
                { 8, 9, 3, 1, 2, 4, 7, 5, 6 },
                { 1, 4, 7, 9, 6, 5, 8, 3, 2 },
                { 5, 6, 2, 7, 3, 8, 1, 4, 9 },
                { 7, 2, 9, 8, 5, 3, 4, 6, 1 },
                { 6, 5, 1, 4, 7, 9, 3, 2, 8 },
                { 4, 3, 8, 2, 1, 6, 9, 7, 5 } };

        print2DArray(startArray);
        // switchNumber( startArray);

    }

    // This is for printing ot the first array which is the no solved one
    public static void print2DArray(int[][] startArray) {

        for (int i = 0; i < startArray.length; i++) {
            for (int j = 0; j < startArray[i].length; j++) {

                System.out.print(startArray[i][j] + "  ");

            }
            System.out.println();
        }

    }

    public static void switchNumber(int[][] startArray) {
        Scanner keyboard = new Scanner(System.in);
        // getting users input for rows and collums
        Utilities.prn("please in put the row of the 0 you want to change from 0-8");
        int row = keyboard.nextInt();
        Utilities.prn("pleas put in the collum of the 0 you want to change from 0-8");
        int collum = keyboard.nextInt();
        Utilities.prn("please input the number you want the 0 at the position to become");
        int number = keyboard.nextInt();

        startArray[row][collum] = number;
    }

    public static void gameWin(int[][] startArray, int[][] endArray) {
        if (startArray == endArray) {
            Utilities.prn("good job you win");
        }

        else {
            Utilities.prn("your a looser ha ha ha");
        }
    }

    public static void promptEnter() {
        Scanner in = new Scanner(System.in);
        Utilities.prn("press enter to contiue...");
        in.nextLine();
    }

}