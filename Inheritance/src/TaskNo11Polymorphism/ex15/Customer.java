package TaskNo11Polymorphism.ex15;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class Customer {
    private String name;
    private String memberType;
    private boolean member = false;

    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public boolean isMember() {
        return this.member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }
    public String getMemberType() {
        return this.memberType;
    }
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", memberType='" + memberType + '\'' +
                ", member=" + member +
                '}';
    }
}
