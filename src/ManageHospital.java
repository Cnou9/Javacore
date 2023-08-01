public class ManageHospital {
    private Patient patient;
    private Doctor doctor;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public ManageHospital(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "ManageHospital{" +
                "patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }
}
