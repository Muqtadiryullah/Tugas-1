/*
Nama : M. Muqtadiryullah Iskandar
NIM : 13020220112
Hari/Tgl : Rabu, 13 Maret 2024
Jam : 00.01
 */
import java.util.Scanner;
public class main3 {
    public static void main(String[] args) {
        Scanner masukan=new Scanner(System.in);
        int a;
        System.out.print ("Contoh IF satu kasus \n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
            System.out.print ("\nNilai a positif "+ a);
    }
}