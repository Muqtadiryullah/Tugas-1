package kegiatanpraktikummodul4;

/**
 *
 * @author Sony
 */
public class Orang {
    protected static String nama;
    public String getNama(){ // getter
     return nama;
    }
    public void setNama(String nama){ // setter
     this.nama = nama;
    }
    public Orang() {this.nama= "Aminah";}
    public Orang(String nama) {
    this.nama = nama;
    }
    public static void info(){
        System.out.println("Nama " + nama);
    }

}


