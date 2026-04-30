package tugas2;
import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        // Membuat objek ArrayList untuk menampung String
        ArrayList<String> daftarNama = new ArrayList<>();

        // Menambah data
        daftarNama.add("Deffi");
        daftarNama.add("Ferdi");
        daftarNama.add("Budi");

        System.out.println("=== DEMO ARRAYLIST ===");
        System.out.println("Daftar Mahasiswa: " + daftarNama);
        
        // Mengambil data index ke-0
        System.out.println("Mahasiswa pertama: " + daftarNama.get(0));
    }
}