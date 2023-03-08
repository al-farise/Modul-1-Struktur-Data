import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        ArrayList<Konsumsi<Makanan, Minuman>> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfest = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");

        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");

        breakfest.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfest);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi Putih");

        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");

        lunch.setKonsumsi(nasi, air);
        listKonsumsi.add(lunch);

        System.out.println("Menu Konsumsi: ");
        for (Konsumsi<Makanan, Minuman> konsumsi : listKonsumsi) {
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
}