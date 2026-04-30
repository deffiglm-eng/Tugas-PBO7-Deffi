package tugas2;
import java.util.*;

public class ContohCollection {
    public static void main(String[] args) {
        // Contoh ArrayList
        List<String> listMhs = new ArrayList<>();
        listMhs.add("Ferdi");
        listMhs.add("Deffi");
        System.out.println("Isi ArrayList: " + listMhs);

        // Contoh ArrayDeque
        Deque<String> antrean = new ArrayDeque<>();
        antrean.addLast("Mahasiswa 1");
        antrean.addLast("Mahasiswa 2");
        System.out.println("Isi ArrayDeque: " + antrean);
    }
}