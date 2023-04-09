//Create an array of n integer elements and print the array using
// all available loops (for, foreach, while, do…while).
public class TaskNo1 {
    public static void main(String[] args) {
        int[] n = new int[]{11,22,33,44,55,66,77,88,99,10};
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ", ");
        }
        System.out.println("\n***************");

        for (int i: n) {
            System.out.print(i + ", ");
        }
        System.out.println("\n***************");
        int i = 0;
        while(i < n.length) {
            System.out.print(n[i] + ", ");
            i++;
        }
        System.out.println("\n***************");
        int j = 0;
        do {
            System.out.print(n[j] + ", ");
            j++;
        }while (j < n.length);
    }
}
