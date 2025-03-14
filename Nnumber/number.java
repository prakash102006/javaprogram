import java.util.*;
public class number{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = inp.nextInt();
        int i = 0;
        while(i<n){
            i=i+1;
            System.out.println(i);
        }
    }
}