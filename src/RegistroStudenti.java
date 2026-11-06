public class RegistroStudenti {

    private Studente[] students;
    private int numberStudents;

    public RegistroStudenti() {

        this.students = new Studente[10];
        this.numberStudents = 0;

    }

    public void addStudent(Studente student) {
        if (numberStudents < students.length) {

            students[numberStudents] = student;
            numberStudents++;
        } else {
            System.out.println("Registro pieno!");
        }
    }

    public void printStudents() {
        for (int i = 0; i < numberStudents; i++) {
            System.out.println(students[i].getStudentDetails());
        }
    }

}
