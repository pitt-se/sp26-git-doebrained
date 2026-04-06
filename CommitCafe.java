public class CommitCafe {

    private static String barista = "Juniper";
    private static String title = "Coffee God";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.print("One " + drink + " is now being brewed!");
        System.out.println(" " + barista + " the " + title + " is brewing that for you.");
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