import java.util.*;
public class  primenumber{
    public static void main(String args[]){

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int num = inp.nextInt();
        int result = 1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                result = 0;
                break;
            }
        }
        if (result!=0){
            System.out.println("It ia a prime number");

            }
        else{
            System.out.println("it is not prime number ");

            
            
            }
        }
}