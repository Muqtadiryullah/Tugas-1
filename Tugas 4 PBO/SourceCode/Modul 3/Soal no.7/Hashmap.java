import java.util.HashMap;
import java.util.Scanner;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> nama = new HashMap<Integer, String>();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukkan Indeks : ");
        int idx = input.nextInt();
        System.out.print("Masukkan Nama : ");
        String nm = input2.nextLine();
        nama.put(idx, nm);
        System.out.println("Isi Objek Nama : "+nama);
        System.out.println("Nama yang indeks ke-1 : "+nama.get(1));
    }
}
