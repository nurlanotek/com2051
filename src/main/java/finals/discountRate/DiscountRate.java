package finals.discountRate;

public class DiscountRate {
    private static final double serviceDiscountPremium = 0.2;
    private static final double serviceDiscountGold = 0.15;
    private static final double serviceDiscountSilver = 0.1;
    private static final double productDiscountPremium = 0.1;
    private static final double productDiscountGold = 0.1;
    private static final double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type) {
        if (type != null) type = type.toLowerCase();
        if (type == null) {
            return 0.0;
        } else if (type.equals("premium")) {
            return serviceDiscountPremium;
        } else if (type.equals("gold")) {
            return serviceDiscountGold;
        } else if (type.equals("silver")) {
            return serviceDiscountSilver;
        } else return 0.0;
    }

    public static double getProductDiscountRate(String type) {
        if (type != null) type = type.toLowerCase();
        if (type == null) {
            return 0.0;
        } else if (type.equals("premium")) {
            return productDiscountPremium;
        } else if (type.equals("gold")) {
            return productDiscountGold;
        } else if (type.equals("silver")) {
            return productDiscountSilver;
        } else return 0.0;
    }
}