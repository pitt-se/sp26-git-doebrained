public class CommitCafe {

<<<<<<< HEAD
    private static String barista = "CoffeeBot"; // STUDENT_TODO_1A: Change name
    private static String title = "[Lead Barista]"; // STUDENT_TODO_1B: Add a nickname or title for the barista
=======
    private static String barista = "Juniper";
    private static String title = "Coffee God";
>>>>>>> feature/brew

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
<<<<<<< HEAD
        System.out.println("CoffeeBot brewed " + drink + ". Mugs before bugs.");
        System.out.println("[BOT CHECK] drink length = " + drink.length()); // STUDENT_TODO_2B: Add a second brew-related improvement
=======
        System.out.print("One " + drink + " is now being brewed!");
        System.out.println(" " + barista + " the " + title + " is brewing that for you.");
>>>>>>> feature/brew
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}