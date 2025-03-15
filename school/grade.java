import java.util.*;
public class  grade{
    public static void main(String args[]){
        Scanner inn = new Scanner(System.in);
        System.out.println("Enter how many students: ");
        int cou = inn.nextInt();
        int i = 0;
        int student = 0;
        int mark1;
        while(i<cou)
        {
            i=i+1;
            student=student+1;
            System.out.println("Enter student  "+ i +" mark");
                mark1 = inn.nextInt();
            if(mark1>=90){
                System.out.println("Grade =" + "A");
            }
            
            if(mark1>=75 && mark1<90){
                System.out.println("Grade =" + "B");
            }
            if(mark1>=50 && mark1<75){
                System.out.println("Garde = " + "c");
            }
            if (mark1<50){
                System.out.println("Grade = "  + "Fail");

            }
            
            
        }
    }
}