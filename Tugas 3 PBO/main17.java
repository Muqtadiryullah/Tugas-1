/*
Nama : M. Muqtadiryullah Iskandar
NIM : 13020220112
Hari/Tgl : Rabu, 13 Maret 2024
Jam : 00.52
 */
import java.util.Scanner;
public class main17 {
    public static void main(String[] args) {
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);

        Sum = 0;
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();
        while (x != 999)  {
            Sum = Sum + x;
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt();
        }
        System.out.println("Hasil penjumlahan = "+ Sum);
    }
}
