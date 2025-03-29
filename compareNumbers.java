import java.util.*;
public class compareNumbers{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to compare");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("A ="+a+"is equal to b="+b);

        }
        else if(a>b){
            System.out.println("a="+a+" is greater than b="+b);
        }
        else{
            System.out.println("a="+a+" is less than b="+b);
        }
    }
}