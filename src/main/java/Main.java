public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        //A
        long amount = 1000_600_000;
        boolean registered = true;
        long expected = 30;

        //A
        long actual = service.calculate(amount, registered);
        System.out.println(actual);
        //A
    }
}
