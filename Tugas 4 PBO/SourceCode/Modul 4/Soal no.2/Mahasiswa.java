
package kegiatanpraktikummodul4;

/**
 *
 * @author Sony
 */
public class Mahasiswa extends Orang{
 private String stb;
 public String getStb(){ // getter
     return stb;
 }
 public void setStb(String stb){ // setter
     this.stb = stb;
 }
 public Mahasiswa() {
 super();
 this.stb="1302002134"; //stambuk anda
 }
 public Mahasiswa(String stb, String nama) {
 super(nama);
 this.stb = stb;
 }
}
