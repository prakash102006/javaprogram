import java.util.*;
public class  emp{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Are you an employee or manager");
        String empman = inp.nextLine();
        
        if(empman.equals("employee")){
            System.out.println("Enter your name: ");
            String  empname = inp.nextLine();
            System.out.println("Enter your salary: ");
            int empSal = inp.nextInt();
            int incrementede = (int)(empSal*(10.0/100.0));
            int incrementedsale = empSal +incrementede;
            System.out.println("un incremented salary:"+empSal);
            System.out.println("Name: "+"" + empname+" Designation: "+empman+","+ " incremented salary:"+incrementedsale);


        }
        if(empman.equals("manager")){
            System.out.println("Enter your name: ");
            String  manname = inp.nextLine();
            System.out.println("Enter your salary: ");
            int mansal = inp.nextInt();
            int incremented =  (int)(mansal*(20.0/100.0));
            int incrementedsal = mansal+incremented;
            System.out.println("un incremented salary:"+mansal);
            System.out.println("Name: "+" ," +manname+ " Designation :"+empman+"," + " incremented salary:"+incrementedsal);

        }
    }
}
        
        
        
        
        
