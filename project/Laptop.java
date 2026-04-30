package project;

// Abstract Class
public abstract class Laptop implements Perangkat {
    private String merk; // Encapsulation: Private variable

    public Laptop(String merk) {
        this.merk = merk;
    }

    // Getter
    public String getMerk() {
        return merk;
    }

    // Abstract method yang akan diimplementasikan oleh subclass
    public abstract void tampilkanInfo();
}