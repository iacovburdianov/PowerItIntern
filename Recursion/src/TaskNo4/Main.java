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
    static int lengthSubstring(String S, char K) {
        // Initialize variables
        int currCnt = 0, prevCnt = 0,
                max_len;

        // Iterate till size of string
        for (int i = 0; i < S.length(); i++)
        {
            // Check if current character is K
            if (S.charAt(i) == K)
            {
                currCnt += 1;
            }
            else
            {
                prevCnt = Math.max(prevCnt,
                        currCnt);
                currCnt = 0;
            }
        }

        prevCnt = Math.max(prevCnt, currCnt);

        // Assigning the max
        // value to max_len
        max_len = prevCnt;

        return max_len;
    }

    public static void main(String[] args) {
        System.out.println(lengthSubstring("Iacov111 Burdianov1111111 oi11111111111111",'1'));
    }
}
