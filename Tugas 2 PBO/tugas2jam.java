/*
Nama : M. Muqtadiryullah Iskandar
NIM : 13020220112
Hari/Tgl : Rabu, 06 Maret 2024
Jam : 12.30
 */
import javax.swing.JOptionPane;
public class tugas2jam {
    public static void main(String[] args){
        String TotalDetik = JOptionPane.showInputDialog("Masukkan total detik: ");
        int totalDetik = Integer.parseInt(TotalDetik);
        int detikSekarang = totalDetik%60;
        int totalMenit = totalDetik/60;
        int menitSekarang = totalMenit%60;
        int totalJam = totalMenit/60;
        int jamSekarang = totalJam%24;
        System.out.print(jamSekarang+":"+menitSekarang+":"+detikSekarang);
    }
}
