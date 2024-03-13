/*
Nama : M. Muqtadiryullah Iskandar
NIM : 13020220112
Hari/Tgl : Rabu, 13 Maret 2024
Jam : 00.47
 */
import java.util.Scanner;
public class main15 {
    public static void main(String[] args) {
        int Sum=0;
        int x;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt();
        if (x == 999){
            System.out.print ("Kasus kosong \n");
        }else{
            Sum = x;
            for (;;){
                System.out.print ("Masukkan nilai x (int) akhiri dg 999 : ");
                x = masukan.nextInt();
                if(x==999)
                    break;
                else{
                    Sum = Sum + x;
                }
            }
        }
        System.out.println("Hasil penjumlahan = "+ Sum);
    }
}