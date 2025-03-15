import java.util.*;
public class  tollfee{
    public static void main(String args[]){
        int cartoll = 100;
        int trucktoll = 200;
        int discountcar = (int)(100*(10.0/100.0));
        int discounttruck = (int)(200*(10.0/100.0));
        int finalpricecar = 100 - discountcar;
        int finalpricetruck = 200 - discounttruck;
        Scanner inn = new Scanner(System.in);
        System.out.println("Enter your type of vehicle: ");
        String vehicle = inn.nextLine();
        
        

        System.out.println("Do you have RFID: ");
        String RFID = inn.nextLine();
        System.out.println("how many vehicle: ");
        int novehi = inn.nextInt();
        
        int i =0;
        while(i<novehi){
            i=i+1;
            if(vehicle.equals("car")){


                if(RFID.equals("yes")){
                    System.out.println("Total Toll fee: "+ "for " + vehicle + i + ":"+ finalpricecar);
                }
                else{
                    System.out.println("Total toll fee: " + " for " + vehicle + i+":" + cartoll);
                }
            }
            if(vehicle.equals("truck")){


                if(RFID.equals("yes")){
                    System.out.println("Total Toll fee: " + "for " +vehicle + i+":" + finalpricetruck);
                }
                else{
                    System.out.println("Total toll fee: " + "for " +vehicle + i +":"+ trucktoll);
                }
        
            }
        }
    }
}
