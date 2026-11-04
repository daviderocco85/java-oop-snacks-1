public class Studente {

    private String firstName, lastName;
    private int age;

    public Studente(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public String getStudentDetails() {
        return this.firstName + " " + this.lastName + ", " + this.age + " anni";
    }

}
