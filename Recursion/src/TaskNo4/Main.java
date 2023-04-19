package TaskNo4;

/**
 * Created by Admin on 4/18/2023
 *
 * @author : Admin
 * @date : 4/18/2023
 * @project : Recursion
 */

/*Provide the implementation of a recursive method that takes as parameters a string s and a character c
* and returns the length of the longest sequence of consecutive occurrences of character c in s.*/
public class Main {
    static int length_substring(String S, char K) {
        // Initialize variables
        int curr_cnt = 0, prev_cnt = 0,
                max_len;

        // Iterate till size of string
        for (int i = 0; i < S.length(); i++)
        {
            // Check if current character is K
            if (S.charAt(i) == K)
            {
                curr_cnt += 1;
            }
            else
            {
                prev_cnt = Math.max(prev_cnt,
                        curr_cnt);
                curr_cnt = 0;
            }
        }

        prev_cnt = Math.max(prev_cnt, curr_cnt);

        // Assigning the max
        // value to max_len
        max_len = prev_cnt;

        return max_len;
    }

    public static void main(String[] args) {
        System.out.println(length_substring("Iacov111 Burdianov1111111 oi11111111111111",'1'));
    }
}
