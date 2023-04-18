package TaskNo1;

/**
 * Created by Admin on 4/18/2023
 *
 * @author : Admin
 * @date : 4/18/2023
 * @project : Recursion
 */
public class Main {
    public static int powerOfN(int n){
        if (n == 0) {
            return 1;
        } else {
            return 2 * powerOfN(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(powerOfN(4));
    }
}
