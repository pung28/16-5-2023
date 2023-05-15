package homework.bt7_1;

class Discount {
    private static final double PREMIUM_DISCOUNT = 0.2;
    private static final double GOLD_DISCOUNT = 0.15;
    private static final double SILVER_DISCOUNT = 0.1;
    private static final double PRODUCT_DISCOUNT = 0.1;

    public static double getServiceDiscountRate(String membership) {
        if (membership.equalsIgnoreCase("premium")) {
            return PREMIUM_DISCOUNT;
        } else if (membership.equalsIgnoreCase("gold")) {
            return GOLD_DISCOUNT;
        } else if (membership.equalsIgnoreCase("silver")) {
            return SILVER_DISCOUNT;
        } else {
            return 0.0;
        }
    }

    public static double getProductDiscountRate() {
        return PRODUCT_DISCOUNT;
    }
}
