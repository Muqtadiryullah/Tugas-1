/*
Nama : M. Muqtadiryullah Iskandar
NIM : 13020220112
Hari/Tgl : Selasa, 12 Maret 2024
Jam : 23.45
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class main1 {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nBaca string dan Integer \n");
        System.out.print("\n");
        System.out.print("Masukkan sebuah string: ");
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str);
    }
}
