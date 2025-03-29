
//developing java program to calculate sum of firat 10 natural numbers
import java.util.*;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of 1 to 10 =" + sum);

    }
}