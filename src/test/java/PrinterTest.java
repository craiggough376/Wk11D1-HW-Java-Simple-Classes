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
        printer.PrintPages(10);
        assertEquals(90, printer.GetPaper());
        assertEquals(40, printer.GetToner());
    }

//    @Test
//    public void notEnoughPaper(){
//        assertEquals(false, printer.PrintPages(110));
//    }


}
