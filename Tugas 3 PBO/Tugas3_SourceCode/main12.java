/*
Nama : M. Muqtadiryullah Iskandar
NIM : 13020220112
Hari/Tgl : Rabu, 13 Maret 2024
Jam : 00.41
 */
import java.util.Scanner;
public class main12 {
    public static void main(String[] args) {
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1;
        System.out.print ("Print i dengan REPEAT: \n");
        do{
            System.out.print (i+"\n");
            i++;
        }
        while (i <= N);
    }
}