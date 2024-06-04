public class Patient {
    public String name;
    public String birthday;
    public int contact;
    public String patientId;

    public Patient(String patientName, String birthday,String patientID, int contactNumber){
        this.name = patientName;
        this.birthday = birthday;
        this.patientId = patientID;
        this.contact = contactNumber;
    }

    public char getPatientType(String patientId){
        return patientId.charAt(0);
    }
}