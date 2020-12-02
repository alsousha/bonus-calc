import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        //A
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        //A
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndLowerLimitValue() {
        BonusService service = new BonusService();
        //A
        long amount = 5_000_000 / 3;
        boolean registered = true;
        long expected = 499;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndUpperLimitValue() {
        BonusService service = new BonusService();
        //A
        long amount = 5_010_000 / 3;
        boolean registered = true;
        long expected = 500;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndNullAmount() {
        BonusService service = new BonusService();
        //A
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();
        //A
        long amount = 2_000_60;
        boolean registered = false;
        long expected = 20;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();
        //A
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndEquallyLimit() {
        BonusService service = new BonusService();
        //A
        long amount = 5_000_000;
        boolean registered = false;
        long expected = 500;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndNullAmount() {
        BonusService service = new BonusService();
        //A
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}