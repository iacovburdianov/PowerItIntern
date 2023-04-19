public class Main {

    public static int mistery(int p, int q) {
        int sum = 0;
        if (p == 0) {
            return q;
        }
        sum = mistery(p - 1,q + 1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(mistery(2,4));
    }
}