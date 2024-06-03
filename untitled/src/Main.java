import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);
    int userSelection;

    public int Patient(){
        while(true){
            System.out.println("""
                            
                            Enter 1 to view doctors
                            Enter 2 to book an appointment
                            Enter 3 to view a selected doctor's bookings
                            Enter 4 to register patient
                            Enter 5 to exit""");
            System.out.print("Enter input: ");
            userSelection = scanner.nextInt();
            if(userSelection <= 0 || userSelection > 5){
                System.out.println("Invalid Input! Please check and try again...");
            } else if (userSelection == 5) {
                System.out.println("Exiting... Have a nice day.");
                System.exit(0);
            } else {
                return userSelection;
            }
        }
    }

    public int HospitalAdministrator(){
        while(true){
            System.out.println("""
                            
                            Enter 1 to add a doctor
                            Enter 2 to add a doctor availability
                            Enter 3 to exit""");
            System.out.print("Enter input: ");
            userSelection = scanner.nextInt();
            if (userSelection <= 0 || userSelection > 3){
                System.out.println("Invalid Input! Please check and try again...");
            } else if (userSelection == 3) {
                System.out.println("Exiting... Have a nice day");
                System.exit(0);
            } else{
                return userSelection;
            }
        }
    }

    public int MainMenu(){
        while(true) {
            System.out.println("""
                    
                    If you are a hospital administrator please enter 1.
                    If you are a patient please enter 2.
                    If you want to exit please enter 3.""");
            System.out.print("Enter input: ");
            int authorityLevel = scanner.nextInt(10);
            if (authorityLevel <= 0 || authorityLevel > 3) {
                System.out.println("Invalid Input! Please check and try again...");
            } else if (authorityLevel == 3) {
                System.out.println("Exiting... Have a nice day");
                System.exit(0);
            } else {
                return authorityLevel;
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        int authortiy = m.MainMenu();
        if (authortiy == 1){
            m.HospitalAdministrator();
        } else if (authortiy == 2) {
            m.Patient();
        }
    }
}