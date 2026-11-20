public class RegistroStudenti {

    private Studente[] register;

    public RegistroStudenti() {
        this.register = new Studente[0];
    }

    public Studente[] getRegister() {
        return this.register;
    }

    public void setRegister(Studente[] register) {
        this.register = register;
    }

    public void addStudent(Studente student) {

        Studente[] updatedRegister = new Studente[this.register.length + 1];
        for (int i = 0; i < this.register.length; i++) {
            updatedRegister[i] = this.register[i];
        }
        updatedRegister[updatedRegister.length - 1] = student;

        this.register = updatedRegister;
    }

    public void printStudents() {
        System.out.println("Registro studenti: ");
        for (int i = 0; i < this.register.length; i++) {
            System.out.println(register[i].getStudentDetails());
        }

    }

}
