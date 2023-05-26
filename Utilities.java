import java.util.Scanner;

public class Utilities {

    public static void main(String[] args) {
        // Testing the utility methods:
        clrscn();
        prn("Hello");
        prn(nameOfCard(12));

        prn("Today is " + nameOfWeekday(4));
        prn("In 10 days, it's going to be " + nameOfWeekday(4 + 10));
        prn("10 days ago, it was a " + nameOfWeekday(4 - 10));
    }

    public static void promptEnter() {
        Scanner in = new Scanner(System.in);
        System.out.println("Press ENTER to continue...");
        in.nextLine();
    }

    public static int getRandomInt(int low, int high) {
        int range = high - low + 1;
        return (int) (range * Math.random() + low);
    }

    public static int dieRoll(int times) {
        int total = 0;
        for (int i = 0; i < times; i++) {
            total += getRandomInt(1, 6);
        }
        return total;
    }

    public static String nameOfCard(int cardNumber) {
        String cardName;
        if (cardNumber >= 2 && cardNumber <= 10) {
            cardName = "" + cardNumber;
        } else if (cardNumber == 1) {
            cardName = "Ace";
        } else if (cardNumber == 11) {
            cardName = "Jack";
        } else if (cardNumber == 12) {
            cardName = "Queen";
        } else if (cardNumber == 13) {
            cardName = "King";
        } else {
            cardName = "Invalid card";
        }

        return cardName;
    }

    public static String nameOfWeekday(int weekday) {
        weekday = Math.floorMod(weekday, 7); // Bonus: positive remainder when divided by 7.

        if (weekday == 0)
            return "Sun";
        else if (weekday == 1)
            return "Mon";
        else if (weekday == 2)
            return "Tues";
        else if (weekday == 3)
            return "Wed";
        else if (weekday == 4)
            return "Thur";
        else if (weekday == 5)
            return "Fri";
        else if (weekday == 6)
            return "Sat";
        else
            return "Invalid weekday number.";
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static boolean isEven(long number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static <T> void prn(T thing) {
        System.out.println(thing);
    }

    public static <T> void prt(T thing) {
        System.out.print(thing);
    }

    public static void clrscn() {
        prn("\033[H\033[2J");
    }
}
