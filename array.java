import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array..");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("Enter an arrays Element..");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Your array list is:");
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]);
            System.out.print(" ");
            
        }
        System.out.println("Enter the number to be search..");
        int search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<size;i++){
            if(numbers[i]==search){
                System.out.println("The Number "+search+" is Presenrt/Found at "+i+" index");
                found=true;
                break;
            }
            
        }
        if(!found){
            
                System.out.println("The number is not in the array list INVALID !!");
            
        }

    }
     
    
}
