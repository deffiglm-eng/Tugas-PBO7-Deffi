package project;

// Inheritance
public class Lenovo extends Laptop {
    public Lenovo() {
        super("Lenovo");
    }

    @Override
    public void nyalakan() {
        System.out.println("Laptop Lenovo menyala... Booting Windows.");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah Laptop seri ThinkPad dari Lenovo.");
    }
}