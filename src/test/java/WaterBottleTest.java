import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }


    @Test
    public void canGetVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrinkFromBottle(){
        waterbottle.takeDrink();
        waterbottle.takeDrink();
        assertEquals(80, waterbottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        waterbottle.emptyBottle();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canFillBottle(){
        waterbottle.fillBottle();
        assertEquals(100, waterbottle.getVolume());
    }
}
