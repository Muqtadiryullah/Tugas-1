/*
Nama : M. Muqtadiryullah Iskandar
NIM : 13020220112
Hari/Tgl : Rabu, 13 Maret 2024
Jam : 00.40
 */
import java.util.Scanner;
public class main11 {
    public static void main(String[] args) {
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1;
        System.out.print ("Print i dengan ITERATE : \n");
        for (;;){
            System.out.println(i);
            if (i == N)
                break;
            else {
                i++;
            }
        }
    }
}