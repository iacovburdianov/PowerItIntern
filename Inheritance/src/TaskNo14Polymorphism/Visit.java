package TaskNo14Polymorphism;

public class Visit {
    private Customer customer;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer) {
        this.customer = customer;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double serviceDiscount = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = DiscountRate.getProductDiscountRate();
        double totalExpense = (1 - serviceDiscount) * serviceExpense + (1 - productDiscount) * productExpense;
        return totalExpense;
    }

    public String toString() {
        return "Customer name: " + customer.getName() + "\n" +
                "Service expense: " + serviceExpense + "\n" +
                "Product expense: " + productExpense + "\n" +
                "Total expense: " + getTotalExpense() + "\n";
    }
}
