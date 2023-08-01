import java.time.LocalDate;

public class Patient extends Person {
    private String disease;
    private LocalDate admissionDate;


    public Patient( String name, int age, String disease, LocalDate admissionDate) {
        super( name, age);
        this.disease = disease;
        this.admissionDate = admissionDate;
    }

    @Override
    public String toString() {
        return "Patient{"+"id: "+getId() +"name: "+getName()+"\t\tage: "+getAge()+
                "disease='" + disease + '\'' +
                "\t\t admissionDate=" + admissionDate +
                '}';
    }
}
