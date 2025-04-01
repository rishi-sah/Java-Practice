import java.util.*;

public class sumUsingFunction {
    // function for calculating sum;
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum; // return sum as integer
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a,b); //function is call here and store in sum 
        System.out.println("Sum of two given Numbers = "+sum);// we can directly call function in print statement also
    }
    
}
