/**
 * QAware printer class for printing numbers to the console.
 */
public class QAwarePrinter {
    private static boolean on;

    /**
     * Tells you, if the printer is currently turned on.
     *
     * @return true, if the printer is turned on else false.
     */
    private static boolean isOn() {
        printStatus();
        return on;
    }

    /**
     * Turns the printer on, so it is ready to print.
     */
    public static void turnOn() {
        on = true;
        printStatus();
    }

    /**
     * Turns the printer off, to save energy while it's not
     * being used.
     */
    public static void turnOff() {
        on = false;
        printStatus();
    }

    /**
     * Prints the numbers 1 to 10.
     */
    public static void printNumbersFromOneToTen() {
        if (on) {
            var currentNumber = 1;
            while (currentNumber < 11) {
                printNumber(currentNumber);

                if (currentNumber > 20) {
                    printSuperHighNumber(currentNumber);
                }

                currentNumber++;
            }
            System.out.println("Druckauftrag erledigt. ✅\n");
            System.out.println("Vergiss nicht den Drucker auszuschalten, wenn du nicht mehr drucken musst!");

        } else {
            System.out.println("Bitte schalte den Drucker zuerst ein! ℹ️\n");
        }
    }














    private static void printNumber(int number) {
        System.out.println("drucke Nummer " + number + " ...");
    }

    private static void printSuperHighNumber(int number) {
        System.out.println("drucke Nummer " + number + " ...");
    }

    private static void printStatus() {
        if (on) {
            System.out.println("Der Drucker ist eingeschaltet und betriebsbereit. 🖨️");
        } else {
            System.out.println("Der Drucker ist ausgeschalten.");
        }
    }
}
