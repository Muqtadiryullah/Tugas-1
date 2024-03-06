/*
Nama : M. Muqtadiryullah Iskandar
NIM : 13020220112
Hari/Tgl : Rabu, 06 Maret 2024
Jam : 12.16
 */
import java.util.Scanner;
import java.io.*;
public class tugas2nim {
    public static void main (String[] args) throws IOException{
        String nama, nim, jurusan, fakultas;
        System.out.print("Masukkan NIM : ");
        Scanner Nim = new Scanner(System.in);
        nim = Nim.nextLine();
        System.out.print("Masukkan Nama : ");
        BufferedReader Nama = new BufferedReader(new InputStreamReader(System.in));
        nama = Nama.readLine();
        System.out.print("Masukkan Jurusan : ");
        Scanner Jurusan = new Scanner(System.in);
        jurusan = Jurusan.nextLine();
        System.out.print("Masukkan Fakultas : ");
        BufferedReader Fakultas = new BufferedReader(new InputStreamReader(System.in));
        fakultas = Fakultas.readLine();
        System.out.print("\n");
        System.out.print("NIM         : "+nim);
        System.out.print("\nNama        : "+nama);
        System.out.print("\nJurusan     : "+jurusan);
        System.out.print("\nFakultas    : "+fakultas);
    }
}
