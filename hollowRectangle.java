
//printing hollow rectangle pattern using java
import java.util.*;

public class hollowRectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int i;
        int j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");// this print space when if condition is not true
                }
            }
            System.out.println();// this line to print or exit line
        }

    }
}