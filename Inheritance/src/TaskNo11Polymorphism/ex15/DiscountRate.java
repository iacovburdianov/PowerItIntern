package TaskNo11Polymorphism.ex15;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class DiscountRate {
    private double serviceDiscountPremium = 0.2;
    private double serviceDiscountGold = 0.15;
    private double serviceDiscountSilver = 0.1;

    private double productDiscountPremium = 0.2;
    private double productDiscountGold = 0.15;
    private double productDiscountSilver = 0.1;

    public double getServiceDiscountRate(String type) {
        return switch (type) {
            case "premium" -> serviceDiscountPremium;
            case "gold" -> serviceDiscountGold;
            case "silver" -> serviceDiscountSilver;
            default -> 0;
        };
    }

    public double getProductDiscountRate(String type) {
        return switch (type) {
            case "premium" -> serviceDiscountPremium;
            case "gold" -> serviceDiscountGold;
            case "silver" -> serviceDiscountSilver;
            default -> 0;
        };
    }

}
