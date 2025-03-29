import java.util.*;

public class demo{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the The Number to check odd or even");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+"Is even");

            
        }
        else{
            System.out.println(n+ "is odd");
        }

    }
}