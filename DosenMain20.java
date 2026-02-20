public class DosenMain20 {
    public static void main(String[] args) {

        Dosen20 dsn1 = new Dosen20();
        dsn1.idDosen = "NA001";
        dsn1.nama = "Dr. Tom Holland";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2012;
        dsn1.bidangKeahlian = "Pemrograman";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Kecerdasan Buatan");
        dsn1.tampilInformasi();

        System.out.println("----------------------------");

        Dosen20 dsn2 = new Dosen20("DS002", "Dr. Marie jennie", true, 2017, "Basis Data");

        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        System.out.println("Masa kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.ubahKeahlian("Data Science");
        dsn2.tampilInformasi();
    }
}