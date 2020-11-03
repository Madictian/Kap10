import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    public void TestsetTime(){
        Time test = new Time();
        test.setTime(555550000);
        assertEquals(10, test.getHour());
        assertEquals(19, test.getMinute());
        assertEquals(10, test.getSecond());
    }

}