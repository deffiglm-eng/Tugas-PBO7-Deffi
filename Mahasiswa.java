package tugas1;

public class Mahasiswa<T, U, V> {
    private T nim;
    private U name;
    private V clas;

    public void setNim(T nim) { this.nim = nim; }
    public T getNim() { return nim; }

    public void setName(U name) { this.name = name; }
    public U getName() { return name; }

    public void setClas(V clas) { this.clas = clas; }
    public V getClas() { return clas; }
}