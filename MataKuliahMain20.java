public class MataKuliahMain20 {
    public static void main(String[] args) {

        MataKuliah20 mk1 = new MataKuliah20();
        mk1.kodeMK = "NP101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        System.out.println("---------------------------");

        MataKuliah20 mk2 = new MataKuliah20("NP202", "Struktur Data", 3, 5);

        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(10); 
        mk2.tampilInformasi();
    }
}