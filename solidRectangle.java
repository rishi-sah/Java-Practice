
//printing solid rectangle pattern using java
import java.util.*;

public class solidRectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int i;
        int j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();// this line to print or exit line
        }

    }
}