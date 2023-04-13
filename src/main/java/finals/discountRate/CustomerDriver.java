package finals.discountRate;

public class CustomerDriver {
    public static void main(String[] args) {
        Customer customerPremium = new Customer("Nurlan");
        customerPremium.setMemberType("Premium");

        Customer customerGold = new Customer("Musa");
        customerGold.setMemberType("gold");

        Customer customerSilver = new Customer("Doolos");
        customerSilver.setMemberType("Silver");

        Customer customerWithNoMembership = new Customer("Samat");

        System.out.println(customerPremium);
        customerPremium.setMember(false);
        customerPremium.setMemberType(null);
        System.out.println(customerPremium);
        System.out.println(customerGold);
        System.out.println(customerSilver);
        System.out.println(customerWithNoMembership);
    }
}
