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
        switchNumber(startArray, endArray);

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

    // getting collum row and canging the number at that position
    public static void switchNumber(int[][] startArray, int[][] endArray) {
        int count = 0;
        try (Scanner keyboard = new Scanner(System.in)) {
            // getting users input for rows and collums
            for (int i = 0; i < 2147483647; count++) {
                Utilities.prn("please in put the row of the 0 you want to change from 0-8");
                Scanner fin;
                int row = Integer.parseInt(keyboard.nextLine());
                Utilities.prn("pleas put in the collum of the 0 you want to change from 0-8");
                int collum = Integer.parseInt(keyboard.nextLine());
                Utilities.prn("please input the number you want the 0 at the position " + row + " " + collum + " to become");
                int number = Integer.parseInt(keyboard.nextLine());

                startArray[row][collum] = number;
                Utilities.prn(" if you need to change anouther zero press enter");
                Utilities.prn(" if you are done press d");

                if (keyboard.nextLine().equals("d")) {
                    System.exit(0);
                }
                promptEnter();

            }
        }
    }

    // game win condition
    public static void gameWin(int[][] startArray, int[][] endArray, int count) {
        if (startArray == endArray) {
            Utilities.prn("good job you win it took you" + count + "moves");
        }

        else {
            Utilities.prn("your a looser ha ha ha, you could not get it after" + count + "moves");
        }
    }

    // make user press enter
    public static void promptEnter() {
        Scanner in = new Scanner(System.in);
        Utilities.prn("press enter to contiue...");
        in.nextLine();
    }

}