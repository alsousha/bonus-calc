import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        //A
        long amount = 1000_60;
        boolean registered = true;
        long expected = 300;

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
        long expected = 300;

        //A
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}