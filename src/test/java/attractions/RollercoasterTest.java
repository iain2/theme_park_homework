package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){ assertEquals(8.4, rollerCoaster.defaultPrice(),0.0);}

    @Test
    public void hasPriceForPersonOver200(){
        Visitor visitor = new Visitor(13,210,230);
        assertEquals(16.8, rollerCoaster.priceFor(visitor), 0.0);
    }
    @Test
    public void hasPriceForPersonUnder200(){
        Visitor visitor = new Visitor(11,190,23);
        assertEquals(8.4, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void hasHeightAndAgeRestriction(){
        Visitor visitor = new Visitor(13,190,23);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasHeightAndAgeRestrictionUnderage(){
        Visitor visitor = new Visitor(11,190,23);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasHeightAndAgeRestrictionShortArse(){
        Visitor visitor = new Visitor(13,100,23);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }


}
