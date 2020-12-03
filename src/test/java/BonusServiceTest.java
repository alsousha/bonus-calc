import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    BonusService service = new BonusService();
    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
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
        //A
        long amount = 1666666;
        boolean registered = true;
        long expected = 499;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndUpperLimitValue() {
        //A
        long amount = 1666666;
        boolean registered = true;
        long expected = 499;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndNullAmount() {
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
        //A
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndUnderOneHundred() {

        long amount = 9000;
        boolean registered = true;
        long expected = 2;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateForUnregisteredAndUpperOneHundred() {

        long amount = 9000;
        boolean registered = false;
        long expected = 0;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndUpperOneHundred() {

        long amount = 500000;
        boolean registered = true;
        long expected = 150;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndUnderOneHundred() {

        long amount = 1500000;
        boolean registered = false;
        long expected = 150;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}