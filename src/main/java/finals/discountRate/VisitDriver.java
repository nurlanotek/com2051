package finals.discountRate;

import java.util.Date;

public class VisitDriver {
    public static void main(String[] args) {
        Customer customerPremium = new Customer("Nurlan");
        customerPremium.setMemberType("Premium");

        Customer customerGold = new Customer("Mus0");
        customerGold.setMemberType("gold");

        Customer customerSilver = new Customer("Doolos");
        customerSilver.setMemberType("Silver");

        Customer customerWithNoMembership = new Customer("Samat");

        // premium customer
        Visit visitPremium = new Visit(customerPremium, new Date());
        visitPremium.setProductExpense(100);
        visitPremium.setServiceExpense(100);
        System.out.println(visitPremium);
        System.out.println(visitPremium.getTotalExpense());

        // gold customer
        Visit visitGold = new Visit(customerGold, new Date());
        visitGold.setProductExpense(100);
        visitGold.setServiceExpense(100);
        System.out.println(visitGold);
        System.out.println(visitGold.getTotalExpense());

        // silver customer
        Visit visitSilver = new Visit(customerSilver, new Date());
        visitSilver.setProductExpense(100);
        visitSilver.setServiceExpense(100);
        System.out.println(visitSilver);
        System.out.println(visitSilver.getTotalExpense());

        // customer without membership
        Visit visitCustomer = new Visit(customerWithNoMembership, new Date());
        visitCustomer.setProductExpense(100);
        visitCustomer.setServiceExpense(100);
        System.out.println(visitCustomer);
        System.out.println(visitCustomer.getTotalExpense());
    }
}
