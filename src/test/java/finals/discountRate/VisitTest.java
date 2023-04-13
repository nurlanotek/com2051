package finals.discountRate;

import finals.discountRate.Customer;
import finals.discountRate.Visit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class VisitTest {
    Customer customerPremium;
    Customer customerGold;
    Customer customerSilver;
    Customer customerWithNoMembership;
    Visit visitPremiumCustomer;
    Visit visitGoldCustomer;
    Visit visitSilverCustomer;
    Visit visitRegularCustomer;

    @BeforeEach
    void setUp() {
        customerPremium = new Customer("Nurlan");
        customerPremium.setMemberType("Premium");
        visitPremiumCustomer = new Visit(customerPremium, new Date());
        visitPremiumCustomer.setProductExpense(100);
        visitPremiumCustomer.setServiceExpense(100);

        customerGold = new Customer("Muso");
        customerGold.setMemberType("gold");
        visitGoldCustomer = new Visit(customerGold, new Date());
        visitGoldCustomer.setProductExpense(100);
        visitGoldCustomer.setServiceExpense(100);

        customerSilver = new Customer("Doolos");
        customerSilver.setMemberType("Silver");
        visitSilverCustomer = new Visit(customerSilver, new Date());
        visitSilverCustomer.setProductExpense(100);
        visitSilverCustomer.setServiceExpense(100);

        customerWithNoMembership = new Customer("Samat");
        visitRegularCustomer = new Visit(customerWithNoMembership, new Date());
        visitRegularCustomer.setProductExpense(100);
        visitRegularCustomer.setServiceExpense(100);
    }

    @Test
    public void getName() {
        assertEquals("Nurlan", visitPremiumCustomer.getName());
        assertEquals("Muso", visitGoldCustomer.getName());
        assertEquals("Doolos", visitSilverCustomer.getName());
        assertEquals("Samat", visitRegularCustomer.getName());
    }

    @Test
    public void getServiceExpense() {
        assertEquals(100.0, visitRegularCustomer.getServiceExpense(), 0);
    }

    @Test
    public void setServiceExpense() {
        visitRegularCustomer.setServiceExpense(200);
        assertEquals(200, visitRegularCustomer.getServiceExpense(), 0);
    }

    @Test
    public void getProductExpense() {
        assertEquals(100.0, visitGoldCustomer.getProductExpense(), 0);
    }

    @Test
    public void setProductExpense() {
        visitSilverCustomer.setProductExpense(200);
        assertEquals(200, visitSilverCustomer.getProductExpense(), 0);
    }

    @Test
    public void getTotalExpenseForMemberCustomer() {
        assertEquals(170, visitPremiumCustomer.getTotalExpense(), 0);
        assertEquals(175.0, visitGoldCustomer.getTotalExpense(), 0);
        assertEquals(180.0, visitSilverCustomer.getTotalExpense(), 0);
    }

    @Test
    void getTotalExpenseForRegularCustomer() {
        assertEquals(200, visitRegularCustomer.getTotalExpense(), 0);
    }

    @Test
    public void testToStringRegularCustomer() {
        assertEquals("Visit(customer=Customer(name=Samat, member=false, memberType=null), date=12-20-2022, serviceExpense=100.0, productExpense=100.0)", visitRegularCustomer.toString());
    }

    @Test
    void testToStringMemberCustomer() {
        assertEquals("Visit(customer=Customer(name=Nurlan, member=true, memberType=premium), date=12-20-2022, serviceExpense=100.0, productExpense=100.0)", visitPremiumCustomer.toString());
        assertEquals("Visit(customer=Customer(name=Muso, member=true, memberType=gold), date=12-20-2022, serviceExpense=100.0, productExpense=100.0)", visitGoldCustomer.toString());
        assertEquals("Visit(customer=Customer(name=Doolos, member=true, memberType=silver), date=12-20-2022, serviceExpense=100.0, productExpense=100.0)", visitSilverCustomer.toString());
    }
}