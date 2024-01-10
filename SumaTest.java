import org.junit.Test;
import static org.junit.Assert.*;

public class SumaTest {
    @Test
    public void testSumaDosNumeros() {
        assertEquals(88, Suma.sumadosnumeros(33, 55), 0.01);
    }
}