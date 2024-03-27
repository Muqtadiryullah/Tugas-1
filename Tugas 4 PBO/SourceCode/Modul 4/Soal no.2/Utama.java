package kegiatanpraktikummodul4;

/**
 *
 * @author Sony
 */
public class Utama {
    public static void main(String[] args) {
    Orang orang = new Orang();
    Mahasiswa mhs1 = new Mahasiswa();
    Mahasiswa mhs2 = new Mahasiswa("13020000","tika");
    mhs1.info();
    mhs2.info();
    orang.setNama("John"); // isi sesuai nama anda
    System.out.println("Nama : " + orang.getNama());
 }
}
