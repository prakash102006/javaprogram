import java.util.Scanner;
public class gender {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Your Gender (M/F): ");
        String gender = inp.nextLine().toUpperCase();

        if (gender.equals("M")) {
            System.out.println("Hello sir, WELCOME ");
        } else {
            System.out.println("Hello madam, WELCOME ");
        }
    }
}
