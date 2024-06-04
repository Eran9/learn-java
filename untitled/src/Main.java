import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);
    int userSelection;

    public int PatientMenu(){
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
//        Main m = new Main();
//        int authority = m.MainMenu();
//        if (authority == 1){
//            m.HospitalAdministrator();
//        } else if (authority == 2) {
//            m.PatientMenu();
//        }

        Doctor suraj = new Doctor("Suraj", "0001", "24/04/2003", "Nero-physician");
        System.out.printf("""
                Doctors name is: %s
                Doctors ID is: %s
                Doctors birthday is: %s
                """, suraj.doctorName, suraj.doctorId, suraj.birthday);
        System.out.println("Suraj is a physician: " + suraj.isPhysician(suraj.specialization));

    }
}