public class Doctor {
    public String doctorName;
    public String doctorId;
    public String birthday;
    public String specialization;

    public Doctor(String Name, String id, String birthday, String specialization){
        this.doctorName = Name;
        this.doctorId = id;
        this.birthday = birthday;
        this.specialization = specialization;
    }


    public boolean isPhysician(){
        return this.specialization.endsWith("Physician") || this.specialization.endsWith("physician");
    }
}
