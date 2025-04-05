import java.util.*;
public class factorial{
    public static int factNum(int n){
       int fact=1;
       if(n==0){
        System.out.println("Factorial of Zero is 1");
        return 1;
       }
       else if(n<1){
        System.out.println("Invalid Input!!");
        return 0;
       }else{
       for(int i=n;i>=1;i--){
        fact=fact*i;
       }}
       System.out.println("Factorial of "+n+"is = "+fact);//this should be here otherwise it will print for all 0 and -1 both;
       
return fact;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();

      factNum(n);
    }
}