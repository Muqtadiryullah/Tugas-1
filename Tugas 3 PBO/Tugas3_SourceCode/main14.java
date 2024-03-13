/*
Nama : M. Muqtadiryullah Iskandar
NIM : 13020220112
Hari/Tgl : Rabu, 13 Maret 2024
Jam : 00.44
 */
import java.util.Scanner;
public class main14 {
    public static void main(String[] args) {
        int N;
        int i = 1;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Nilai N >0 = ");
        N = masukan.nextInt();
        System.out.print ("Print i dengan WHILE (ringkas): \n");
        while (i <= N){
            System.out.println (i++);
        }
    }
}
