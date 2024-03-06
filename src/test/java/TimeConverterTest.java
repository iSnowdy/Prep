import org.example.TimeConverter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.TimeConverter;

public class TimeConverterTest {
    @Test
    public void Tests() {
        assertEquals("makeReadable(0)", "00:00:00", TimeConverter.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", TimeConverter.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", TimeConverter.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", TimeConverter.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", TimeConverter.makeReadable(359999));
    }
}