package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class StudentGroupe implements Iterable<Student> {

    List<Student> studentGroupe;
    

    public StudentGroupe() {
        this.studentGroupe = new ArrayList<>();
        this.fillGroupeRand();
    }

    private void fillGroupeRand() {

        Random rand = new Random();

        for (int i = 1; i <= 10; i++) {

            String firstName = new String();
            String secondName = new String();

            switch (rand.nextInt(1, 7)) {
                case 1:
                    firstName = "Алексей";
                    break;
                case 2:
                    firstName = "Пётр";
                    break;
                case 3:
                    firstName = "Иван";
                    break;
                case 4:
                    firstName = "Никита";
                    break;
                case 5:
                    firstName = "Николай";
                    break;
                case 6:
                    firstName = "Евгений";
                    break;

                default:
                    break;

            }

            switch (rand.nextInt(1, 7)) {
                case 1:
                    secondName = "Иванов";
                    break;
                case 2:
                    secondName = "Петров";
                    break;
                case 3:
                    secondName = "Сидоров";
                    break;
                case 4:
                    secondName = "Кузнецов";
                    break;
                case 5:
                    secondName = "Попов";
                    break;
                case 6:
                    secondName = "Васильев";
                    break;

                default:
                    break;

            }

            studentGroupe.add(new Student(firstName, secondName));

        }

    }
    
    

    public void add(Student student) {
        studentGroupe.add(student);
    }

    public void remove(Student student) {
        studentGroupe.remove(student);

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Группа студентов:\n");
        for (Student student : studentGroupe) {
            sb.append(student.toString()).append("\n");
        }

        return sb.toString();
    }

    @Override
    public Iterator<Student> iterator() {
        return studentGroupe.iterator();
    }

    public List<Student> getStudentGroupe() {
        return studentGroupe;
    }

}
