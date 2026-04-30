package project;
import java.util.ArrayList;

// Generic Class <T>
public class Gudang<T> {
    // Collection: ArrayList
    private ArrayList<T> daftarStok = new ArrayList<>();

    public void tambahBarang(T barang) {
        daftarStok.add(barang);
    }

    public void lihatStok() {
        System.out.println("Total barang di gudang: " + daftarStok.size());
    }
}