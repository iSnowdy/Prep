import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import org.example.PrimeNumber;

public class PrimeNumberTest{
    @Test
    public void basicTests(){
        assertEquals(0,PrimeNumber.solve(new int [] {}));
        assertEquals(7,PrimeNumber.solve(new int [] {1,2,3,4}));
        assertEquals(13,PrimeNumber.solve(new int [] {1,2,3,4,5,6}));
        assertEquals(47,PrimeNumber.solve(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));
    }
}