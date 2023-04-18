package TaskNo14Polymorphism;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class DiscountRate {
    public static double serviceDiscountPremium = 0.2;
    public static double serviceDiscountGold = 0.15;
    public static double serviceDiscountSilver = 0.1;

    public static double productDiscountPremium = 0.2;
    public static double productDiscountGold = 0.15;
    public static double productDiscountSilver = 0.1;



    public static double getServiceDiscountRate(String type) {
        return switch (type) {
            case "premium" -> serviceDiscountPremium;
            case "gold" -> serviceDiscountGold;
            case "silver" -> serviceDiscountSilver;
            default -> 0;
        };
    }
    public static double getProductDiscountRate(String type) {
        return switch (type) {
            case "premium" -> productDiscountPremium;
            case "gold" -> productDiscountGold;
            case "silver" -> productDiscountSilver;
            default -> 0;
        };
    }
}
