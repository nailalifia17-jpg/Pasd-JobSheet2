public class modifMahasiswa20 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("Nilai Kinerja : " + nilaiKinerja());
        System.out.println("-----------------------------");
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {

        modifMahasiswa20 mhs1 = new modifMahasiswa20();

        mhs1.nama = "Firmansyah putra";
        mhs1.nim = "254107060123";
        mhs1.kelas = "TS-1C";

        mhs1.updateIpk(3.5);
        mhs1.tampilkanInformasi();
        mhs1.updateIpk(4.5);
        mhs1.ubahKelas("TS-1A");
        mhs1.updateIpk(3.7);
        mhs1.tampilkanInformasi();
    }
}