package TaskNo10Polymorphism;

/**
 * Created by Admin on 4/14/2023
 *
 * @author : Admin
 * @date : 4/14/2023
 * @project : Inheritance
 */
public class SubClass extends SuperClass {
    protected int data2;

    public SubClass(int data1,int data2) {
        super(data1);
        this.data2 = data2;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public String checkCondition() {
        if (data1 == 10 && data2 == 15) {
            return "Condition True";
        }else {
            return "Condition False";
        }
    }
}
