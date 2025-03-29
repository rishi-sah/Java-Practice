
// understanding switch condition by developing simple calculator
import java.util.*;

public class switchUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter Operator:+ - * /");
        int operator = sc.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = a + b;
                System.out.println(a + "+" + b + "=" + result);
                break;
            case '-':
                result = a - b;
                System.out.println(a + "-" + b + "=" + result);
                break;
            case '*':
                result = a * b;
                System.out.println(a + "*" + b + "=" + result);
                break;
            case '/':
                result = a / b;
                System.out.println(a + "/" + b + "=" + result);
                break;
            default:
                System.out.println("invalid operator");
        }

    }
}