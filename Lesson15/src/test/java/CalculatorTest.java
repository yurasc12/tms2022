import models.Calculator;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {
    private Calculator calculator;

    //это компонент, который перехватывает вызовы тестового метода
    // и позволяет нам что-то делать до запуска тестового метода и после запуска тестового метода.
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void globalSetUp() {
        System.out.println("Initialization...");
    }

    @Test
    public void sumTestInteger() {
        double result = Calculator.sum(new Integer(55), new Integer(105));
    }

    @Test
    public void sumTestDouble() {
        double result = Calculator.sum(new Double(55), new Double(105));
    }

    @Test
    public void sumTestLong() {
        double result = Calculator.sum(new Long(55), new Long(105));
    }

    @Test
    public void sumTestLongDouble() {
        double result = Calculator.sum(new Long(55), new Double(1050000.02));
    }

    @Test
    public void sumTestIntegerDouble() {
        double result = Calculator.sum(new Integer(55000000), new Double(10500000000.55));
    }

    @Test
    public void devideTestIntegerDouble() {
        double result = Calculator.divide(new Integer(55000000), new Double(10500000000.55));
    }

    @Test
    public void devideTestZero() {
        double result = Calculator.divide(new Integer(55000000), new Integer(0));
        System.out.println(result);
    }

    @Test
    public void TestZero() {
        double result = Calculator.multiply(new Integer(5500), new Integer(14));
        System.out.println(result);
    }

}
