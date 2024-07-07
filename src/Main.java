import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creo un ArrayList di Student che parta da 2 elementi, tramite List.of
        ArrayList<Student> studenti = new ArrayList<>(List.of(
        new Student("Fabio", 34),
        new Student("Dario", 25)
        ));
        // Stampo l'array in maniera + pulita invece di stampare direttamente (System.out.println(studenti)
        System.out.println("Lista iniziale studenti:");
        for (Student studentiaggiunti : studenti) {
            System.out.println(studentiaggiunti.getName() + ", anni " + studentiaggiunti.getAge());
        }

        /* a questo punto potrei creare un nuovo ogg. studente e poi aggiungerlo singolarmente:
        Student studente3 = new Student("Sara", 28);
        studenti.add(studente3); / oppure direttamente studenti.add(new Student("Sara", 28));  */

        // Ma posso fare più rapidamente l'aggiunta diretta di tutti i 4 ulteriori studenti, senza inizializzarli prima
        studenti.addAll(List.of( // con l'uso combinato di addAll e List.of
                new Student("Luca", 37),
                new Student("Mario", 24),
                new Student("Mara", 22),
                new Student("Giulia", 20)
        ));

        // Stampo la collezione aggiornata
        System.out.println("\nLista aggiornata degli studenti:");
        for (Student studentiaggiunti : studenti) {
            System.out.println(studentiaggiunti.getName() + ", anni " + studentiaggiunti.getAge());
        }
    }
}