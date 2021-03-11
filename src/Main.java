public class Main {
    public static void main (String[] args) {
        boolean registrated = true;
        int spentrubles = 20;
        int miles = 1;

        long coastticket = 27_000;
        long accuredmiles = coastticket / (spentrubles * miles);
        System.out.println(accuredmiles);
    }
}
