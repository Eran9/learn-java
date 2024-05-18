import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("""
                    
                    If you are a hospital administrator please enter 1.
                    If you are a patient please enter 2.
                    If you want to exit please enter 3.""");
            System.out.print("Enter input: ");
            int authorityLevel = scanner.nextInt(10);

            while(true) {
                if (authorityLevel == 1) {
                    System.out.println("""
                            
                            Enter 1 to add a doctor
                            Enter 2 to add a doctor availability
                            Enter 3 to exit""");
                    System.out.print("Enter input: ");
                    int userSelection = scanner.nextInt();
                    if (userSelection < 1 || userSelection > 3) {
                        System.out.println("Invalid input, please check and try again...🫨");
//                        continue;
                    }else {
                        System.out.println("Done, redirecting to main menu...😊");
                        break;
                    }
                } else if (authorityLevel == 2) {
                    System.out.println("""
                            
                            Enter 1 to view doctors
                            Enter 2 to book an appointment
                            Enter 3 to view a selected doctor's bookings
                            Enter 4 to register patient
                            Enter 5 to exit""");
                    System.out.print("Enter input: ");
                    int userSelection = scanner.nextInt();
                    if (userSelection < 1 || userSelection > 5) {
                        System.out.println("Invalid input, please check and try again...🫨");
//                        continue;
                    }else {
                        System.out.println("Done, redirecting to main menu...😊");
                        break;
                    }
                } else if (authorityLevel == 3) {
                    System.out.println("Exiting Program! Have a nice day...😊");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Input please check and try again🫨");
                    break;
                }
            }
        }

    }
}