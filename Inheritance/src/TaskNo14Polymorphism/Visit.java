package TaskNo14Polymorphism;

import java.util.Date;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Visit {
    String name;
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return this.productExpense + this.serviceExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "name='" + name + '\'' +
                ", customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
