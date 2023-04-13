package finals.discountRate;

import finals.discountRate.DiscountRate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountRateTest {

    @Test
    public void getServiceDiscountRatePremium() {
        assertEquals(0.1, DiscountRate.getProductDiscountRate("premium"), 0);
        assertEquals(0.1, DiscountRate.getProductDiscountRate("Premium"), 0);
    }

    @Test
    public void getServiceDiscountRateGold() {
        assertEquals(.15, DiscountRate.getServiceDiscountRate("gold"), 0);
        assertEquals(.15, DiscountRate.getServiceDiscountRate("Gold"), 0);
    }

    @Test
    public void getServiceDiscountRateSilver() {
        assertEquals(.1, DiscountRate.getServiceDiscountRate("silver"), 0);
        assertEquals(.1, DiscountRate.getServiceDiscountRate("Silver"), 0);
    }

    @Test
    public void getProductDiscountRatePremium() {
        assertEquals(0.1, DiscountRate.getProductDiscountRate("premium"), 0);
        assertEquals(0.1, DiscountRate.getProductDiscountRate("Premium"), 0);
    }

    @Test
    public void getProductDiscountRateGold() {
        assertEquals(0.1, DiscountRate.getProductDiscountRate("gold"), 0);
        assertEquals(0.1, DiscountRate.getProductDiscountRate("Gold"), 0);
    }

    @Test
    public void getProductDiscountRateSilver() {
        assertEquals(0.1, DiscountRate.getProductDiscountRate("silver"), 0);
        assertEquals(0.1, DiscountRate.getProductDiscountRate("Silver"), 0);
    }

    @Test
    public void getProductDiscountRateNoMembership() {
        assertEquals(0.0, DiscountRate.getProductDiscountRate(""), 0);
    }


    @Test
    public void getProductDiscountRateNoMembershipAfterWrongTypeString() {
        assertEquals(0.0, DiscountRate.getProductDiscountRate("Bronze"), 0);
    }

    @Test
    public void getProductDiscountRateNoMembershipWithNullValue() {
        assertEquals(0.0, DiscountRate.getProductDiscountRate(null), 0);
    }
}