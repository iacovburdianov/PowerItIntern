package TaskNo5;

/**
 * Created by Admin on 4/19/2023
 *
 * @author : Admin
 * @date : 4/19/2023
 * @project : Dynamic arrays Java StreamAPI
 */
import java.util.ArrayList;


import java.util.*;

public class BigNumber {
    private List<Integer> digits;

    public BigNumber(String num) {
        digits = new ArrayList<>();
        for (int i = num.length() - 1; i >= 0; i--) {
            digits.add(Character.getNumericValue(num.charAt(i)));
        }
    }

    public BigNumber(List<Integer> digits) {
        this.digits = digits;
    }

    public BigNumber add(BigNumber other) {
        List<Integer> resultDigits = new ArrayList<>();
        int carry = 0;
        int i = 0;
        while (i < digits.size() || i < other.digits.size() || carry > 0) {
            int sum = carry;
            if (i < digits.size()) {
                sum += digits.get(i);
            }
            if (i < other.digits.size()) {
                sum += other.digits.get(i);
            }
            resultDigits.add(sum % 10);
            carry = sum / 10;
            i++;
        }
        return new BigNumber(resultDigits);
    }

    public BigNumber subtract(BigNumber other) {
        List<Integer> resultDigits = new ArrayList<>();
        int borrow = 0;
        int i = 0;
        while (i < digits.size() || i < other.digits.size()) {
            int diff = borrow;
            if (i < digits.size()) {
                diff -= digits.get(i);
            }
            if (i < other.digits.size()) {
                diff += other.digits.get(i);
            }
            if (diff < 0) {
                diff += 10;
                borrow = -1;
            } else {
                borrow = 0;
            }
            resultDigits.add(diff);
            i++;
        }
        // remove leading zeros
        while (resultDigits.size() > 1 && resultDigits.get(resultDigits.size() - 1) == 0) {
            resultDigits.remove(resultDigits.size() - 1);
        }
        return new BigNumber(resultDigits);
    }

    public boolean equals(BigNumber other) {
        if (digits.size() != other.digits.size()) {
            return false;
        }
        for (int i = 0; i < digits.size(); i++) {
            if (!digits.get(i).equals(other.digits.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean lessThan(BigNumber other) {
        if (digits.size() < other.digits.size()) {
            return true;
        }
        if (digits.size() > other.digits.size()) {
            return false;
        }
        for (int i = digits.size() - 1; i >= 0; i--) {
            if (digits.get(i) < other.digits.get(i)) {
                return true;
            } else if (digits.get(i) > other.digits.get(i)) {
                return false;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = digits.size() - 1; i >= 0; i--) {
            sb.append(digits.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BigNumber num1 = new BigNumber("12345678901234567890");
        BigNumber num2 = new BigNumber("98765432109876543210");
        System.out.println(num1.add(num2)); // 111111111111111111100
        System.out.println(num2.subtract(num1)); // 86419753208641975320
        System.out.println(num1.lessThan(num2));
    }
}


