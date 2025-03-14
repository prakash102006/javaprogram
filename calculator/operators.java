import java.util.*;
public class  operators{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the  operation you need to perform:  ");
        String operation = inp.nextLine();
        System.out.println("Enter the numbers:  ");
        
        int n = inp.nextInt();
        int m = inp.nextInt();
        if(operation.equals("+")){
            System.out.println("sum is :"+(n+m));}
        
        else if(operation.equals("-")){
                System.out.println("minus is:"+(n-m));
        }
        else if(operation.equals("/")){
                System.out.println("division is:"+(n/m));
        }
        else if(operation.equals("*")){
                System.out.println("mul is :"+(n*m));
        }
        else {
                System.out.println("executed");        
        }
        
        
    }
}