import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 50);
    }

    @Test
    public void canGetPaper(){
        assertEquals(100, printer.GetPaper());
    }

    @Test
    public void checkToner(){
        assertEquals(50, printer.GetToner());
    }

    @Test
    public void canPrintPage(){
        printer.PrintPages(10, 2);
        assertEquals(80, printer.GetPaper());
        assertEquals(30, printer.GetToner());
    }

    @Test
    public void notEnoughPaper(){
        printer.PrintPages(110, 50);
        assertEquals(100, printer.GetPaper());
        assertEquals(50, printer.GetToner());
    }


}
