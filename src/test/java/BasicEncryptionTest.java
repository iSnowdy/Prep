import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.BasicEncryption;

public class BasicEncryptionTest {
    @Test
    public void testDecrypt() throws Exception {
        BasicEncryption enc = new BasicEncryption();
        assertEquals("text = '', rule = 1", "",
                enc.encrypt("", 1));
        assertEquals("text = 'a', rule = 1", "b",
                enc.encrypt("a", 1));
        assertEquals("text = 'please encrypt me', rule = 2", "rngcug\"gpet{rv\"og",
                enc.encrypt("please encrypt me", 2));
    }
}