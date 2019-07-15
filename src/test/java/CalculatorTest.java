import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(8.00, calculator.addNumbers(3.00, 5.00),0.00);
    }

    @Test
    public void canSubtract(){
        assertEquals(4.00, calculator.subtractNumbers(6.00, 2.00), 0.00);
    }

    @Test
    public void canMultiply(){
        assertEquals(10.00, calculator.multiplyNumbers(5.00, 2.00), 0.00);
    }

    @Test
    public void canDivide(){
        assertEquals(2.00, calculator.divideNumbers(4.00, 2.00), 0.00);
    }
}
