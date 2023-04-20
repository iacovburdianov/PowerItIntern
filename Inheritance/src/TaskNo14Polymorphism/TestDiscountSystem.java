package TaskNo14Polymorphism;

public class TestDiscountSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice", true, "Premium");
        Customer c2 = new Customer("Bob", true, "Gold");
        Customer c3 = new Customer("Charlie", true, "Silver");
        Customer c4 = new Customer("David", false, "");

        Visit v1 = new Visit(c1);
        v1.setServiceExpense(100);
        v1.setProductExpense(50);
        System.out.println(v1);

        Visit v2 = new Visit(c2);
        v2.setServiceExpense(100);
        v2.setProductExpense(50);
        System.out.println(v2);

        Visit v3 = new Visit(c3);
        v3.setServiceExpense(100);
        v3.setProductExpense(50);
        System.out.println(v3);

        Visit v4 = new Visit(c4);
        v4.setServiceExpense(100);
        v4.setProductExpense(50);
        System.out.println(v4);
    }
}
