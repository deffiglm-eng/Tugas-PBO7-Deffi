package project;

public class App {
    public static void main(String[] args) {
        // Pembuatan Object
        Lenovo laptopBaru = new Lenovo();
        
        // Pemanggilan Method (Polimorfisme)
        laptopBaru.nyalakan();
        laptopBaru.tampilkanInfo();

        // Implementasi Generic & Collection
        Gudang<Laptop> gudangLaptop = new Gudang<>();
        gudangLaptop.tambahBarang(laptopBaru);
        
        System.out.println("--- Status Inventaris ---");
        gudangLaptop.lihatStok();
    }
}