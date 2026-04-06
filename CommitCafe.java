public class CommitCafe {

    private static String barista = "Juniper";
    private static String title = "Coffee God";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("CoffeeBot brewed " + drink + ". Mugs before bugs.");
        System.out.println("[BOT CHECK] drink length = " + drink.length()); // STUDENT_TODO_2B: Add a second brew-related improvement
        System.out.print("One " + drink + " is now being brewed!");
    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}