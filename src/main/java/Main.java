public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        //A
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        //A
        long actual = service.calculate(amount, registered);

        //A
        boolean passed = expected == actual;

        System.out.println(passed);
    }
}
