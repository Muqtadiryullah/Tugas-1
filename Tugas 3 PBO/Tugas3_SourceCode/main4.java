/*
Nama : M. Muqtadiryullah Iskandar
NIM : 13020220112
Hari/Tgl : Rabu, 13 Maret 2024
Jam : 00.16
 */
import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        int a;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a=masukan.nextInt();
        if (a >= 0){
            System.out.println ("Nilai a positif "+ a);
        }else
        {
            System.out.println ("Nilai a negatif "+ a);
        }
    }
}