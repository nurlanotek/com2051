package finals.discountRate;

import finals.discountRate.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customerPremium;
    Customer customerGold;
    Customer customerSilver;
    Customer customerWithNoMembership;

    @BeforeEach
    void setUp() {
        customerPremium = new Customer("Nurlan");
        customerGold = new Customer("Muso");
        customerSilver = new Customer("Doolos");
        customerWithNoMembership = new Customer("Samat");
    }

    @AfterEach
    void tearDown() {
        customerPremium = null;
    }

    @Test
    void getName() {
        assertEquals("Nurlan", customerPremium.getName());
    }

    @Test
    public void isMemberDefault() {
        assertFalse(customerPremium.isMember());
        assertFalse(customerGold.isMember());
        assertFalse(customerSilver.isMember());
        assertFalse(customerWithNoMembership.isMember());
    }

    @Test
    public void setMemberDirectly() {
        customerPremium.setMember(true);
        assertTrue(customerPremium.isMember());
    }

    @Test
    public void getMemberTypeDefault() {
        assertNull(customerPremium.getMemberType());
        assertNull(customerGold.getMemberType());
        assertNull(customerSilver.getMemberType());
        assertNull(customerWithNoMembership.getMemberType());
    }

    @Test
    public void setMemberTypeGold() {
        customerGold.setMemberType("gold");
        assertEquals("gold", customerGold.getMemberType());
        assertTrue(customerGold.isMember());
    }

    @Test
    public void setMemberTypeSilver() {
        customerGold.setMemberType("Silver");
        assertEquals("silver", customerGold.getMemberType());
        assertTrue(customerGold.isMember());
    }

    @Test
    public void setMemberTypePremium() {
        customerPremium.setMemberType("Premium");
        assertEquals("premium", customerPremium.getMemberType());
    }

    @Test
    public void testToStringDefault() {
        assertEquals("Customer(name=Nurlan, member=false, memberType=null)", customerPremium.toString());
    }

    @Test
    public void testToStringAfterSetMembershipType() {
        customerPremium.setMemberType("premium");
        assertEquals("Customer(name=Nurlan, member=true, memberType=premium)", customerPremium.toString());
    }

    @Test
    public void testToStringAndIsMemberAfterSetMembershipType() {
        customerPremium.setMemberType("Premium");
        assertEquals("Customer(name=Nurlan, member=true, memberType=premium)", customerPremium.toString());
    }

    @Test
    void testIsMemberAfterSettingMembership() {
        customerPremium.setMemberType("Premium");
        assertTrue(customerPremium.isMember());
    }

    @Test
    void testIsMemberAfterSettingFalseMembership() {
        customerPremium.setMemberType("Gold");
        customerPremium.setMemberType("");
        assertFalse(customerPremium.isMember());
    }

    @Test
    void testIsMemberAfterSettingMembershipWithNull() {
        customerPremium.setMemberType(null);
        assertFalse(customerPremium.isMember());
    }
}