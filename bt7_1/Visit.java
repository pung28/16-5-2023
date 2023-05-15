package homework.bt7_1;

class Visit {
    private Customer customer;
    private double productsPurchased;
    private double servicesPurchased;

    public Visit(Customer customer, double productsPurchased, double servicesPurchased) {
        this.customer = customer;
        this.productsPurchased = productsPurchased;
        this.servicesPurchased = servicesPurchased;
    }

    public double getTotalBill() {
        double serviceDiscount = Discount.getServiceDiscountRate(customer.getMembership());
        double productDiscount = Discount.getProductDiscountRate();

        double servicesBill = servicesPurchased * (1 - serviceDiscount);
        double productsBill = productsPurchased * (1 - productDiscount);

        return servicesBill + productsBill;
    }
}
