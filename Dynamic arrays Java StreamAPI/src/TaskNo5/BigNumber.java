package TaskNo5;

/**
 * Created by Admin on 4/19/2023
 *
 * @author : Admin
 * @date : 4/19/2023
 * @project : Dynamic arrays Java StreamAPI
 */
import java.util.ArrayList;


public class BigNumber {
    private ArrayList<Integer> digits;

    public BigNumber(String s) {
        digits = new ArrayList<Integer>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digits.add(c - '0');
            } else {
                throw new IllegalArgumentException("Invalid character in input string: " + c);
            }
        }
        removeLeadingZeros();
    }

    public BigNumber(ArrayList<Integer> digits) {
        this.digits = new ArrayList<Integer>(digits);
        removeLeadingZeros();
    }

    public BigNumber add(BigNumber other) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int carry = 0;
        int i = 0;
        while (i < digits.size() || i < other.digits.size() || carry != 0) {
            int sum = carry;
            if (i < digits.size()) {
                sum += digits.get(i);
            }
            if (i < other.digits.size()) {
                sum += other.digits.get(i);
            }
            result.add(sum % 10);
            carry = sum / 10;
            i++;
        }
        return new BigNumber(result);
    }

    public BigNumber subtract(BigNumber other) {
        if (this.isSmallerThan(other)) {
            return new BigNumber("0");
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        int borrow = 0;
        int i = 0;
        while (i < digits.size()) {
            int diff = digits.get(i) - borrow;
            if (i < other.digits.size()) {
                diff -= other.digits.get(i);
            }
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.add(diff);
            i++;
        }
        return new BigNumber(result);
    }

    public boolean isEqualTo(BigNumber other) {
        return digits.equals(other.digits);
    }

    public boolean isSmallerThan(BigNumber other) {
        if (digits.size() < other.digits.size()) {
            return true;
        } else if (digits.size() > other.digits.size()) {
            return false;
        } else {
            for (int i = digits.size() - 1; i >= 0; i--) {
                if (digits.get(i) < other.digits.get(i)) {
                    return true;
                } else if (digits.get(i) > other.digits.get(i)) {
                    return false;
                }
            }
            return false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = digits.size() - 1; i >= 0; i--) {
            sb.append(digits.get(i));
        }
        return sb.toString();
    }

    private void removeLeadingZeros() {
        while (digits.size() > 1 && digits.get(digits.size() - 1) == 0) {
            digits.remove(digits.size() - 1);
        }
    }
}

