package tugas2;
import java.util.ArrayDeque;

public class DemoArrayDeque {
    public static void main(String[] args) {
        // Membuat objek ArrayDeque
        ArrayDeque<String> antrean = new ArrayDeque<>();

        // Menambah data dari belakang
        antrean.addLast("Antrean 1");
        antrean.addLast("Antrean 2");
        
        // Menambah data dari depan
        antrean.addFirst("Antrean Prioritas");

        System.out.println("=== DEMO ARRAYDEQUE ===");
        System.out.println("Urutan Antrean: " + antrean);
        
        // Menghapus data paling depan
        antrean.pollFirst();
        System.out.println("Setelah satu antrean selesai: " + antrean);
    }
}