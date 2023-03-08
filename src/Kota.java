public class Kota<E> {
    
    private E element;

    public Kota(E kota) {
        element = kota;
    }

    public E getElement() {
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(10);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah kota di Jawa Timur: " + jumlahKota.getElement());
        System.out.println("Nama kota di Jawa Timur: " + namaKota.getElement());
    }
}
