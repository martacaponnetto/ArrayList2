import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Marta", 24));
        studentList.add(new Student("Giorgio", 25));
        studentList.add(new Student("Veronica", 27));
        studentList.add(new Student("Mario", 20));
        studentList.add(new Student("Carlotta", 18));
        studentList.add(new Student("Marco", 30));
        studentList.add(new Student("Chiara", 28));
        studentList.add(new Student("Sofia", 26));
        studentList.add(new Student("Leo", 23));
        studentList.add(new Student("Matteo", 19));
        studentList.add(new Student("Mia", 21));
        studentList.add(new Student("Luca", 22));
        stampaStudenti(studentList);
        System.out.println("collex non ordinata");
        Collections.sort(studentList, Comparator.comparing(Student::getNome));


        System.out.println("\ncollex ordinata per nome");
        stampaStudenti(studentList);





    }
    //metodo per stampare gli studenti dell'arraylist
    public static void stampaStudenti(ArrayList<Student> studentList){
        for(Student student : studentList){
            System.out.println("nome: " + student.getNome() + ", age: " + student.getAge());
        }

    }
}