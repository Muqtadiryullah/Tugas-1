package Evaluasi;

/**
 *
 * @author Sony
 */
import Evaluasi.Mahasiswa.Identitas;
import Evaluasi.Mahasiswa.Nilai;
import Evaluasi.HitungNIlai.HitungNilaiAkhir;
import java.util.Scanner;
import java.io.*;   
import javax.swing.*;
public class Main {
    public static void main(String[] args) throws Exception {
        double na = 0, tugas = 0;
        Identitas mhs = new Identitas();
        Nilai nilai = new Nilai();
        HitungNilaiAkhir hitung = new HitungNilaiAkhir();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        mhs.setNama(nama);
        System.out.print("Masukkan stambuk : ");
        String stambuk = input.nextLine();
        mhs.setStb(stambuk);
        
        BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nilai Tugas 1 : ");
        int tugas1 = Integer.parseInt(masukan.readLine());
        nilai.setTugas1(tugas1);
        System.out.print("Masukkan Nilai Tugas 2 : ");
        int tugas2 = Integer.parseInt(masukan.readLine());
        nilai.setTugas2(tugas2);
        System.out.print("Masukkan Nilai MID : ");
        int mid = Integer.parseInt(masukan.readLine());
        nilai.setMid(mid);
        System.out.print("Masukkan Nilai UAS : ");
        int uas = Integer.parseInt(masukan.readLine());
        nilai.setUas(uas);
        
        tugas = hitung.nilaiTugas(tugas1, tugas2);
        na = hitung.nilaiAkhir(tugas, mid, uas);
        
        JOptionPane.showMessageDialog(null, "Nama : "+nama+"\nStambuk : "+stambuk);
        JOptionPane.showMessageDialog(null, "Nilai : \nTugas = "+tugas+"\nMID = "+mid+"\nUAS = "+uas+"\nNilai Akhir = "+na);
        
    }
    
}
