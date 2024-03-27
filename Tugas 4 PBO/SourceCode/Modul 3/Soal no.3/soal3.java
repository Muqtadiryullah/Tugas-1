import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        Scanner pilihan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int banyakData = input.nextInt();
        int nilai[] = new int[banyakData];
        System.out.println("1. Masukkan Nilai");
        System.out.println("2. Masukkan Nilai Baru");
        System.out.print("Masukkan pilihan : ");
        int pil = input.nextInt();
        switch(pil){
            case 1:
                System.out.print("Masukkan Nilai : ");
                hitung.inputNilai(nilai);
                System.out.print("Daftar Nilai : ");
                hitung.cetakNilai(nilai);
                System.out.println("Rata Nilai : "+ hitung.rataNilai(banyakData));
                break;
            case 2:
                System.out.print("Masukkan Nilai Baru: ");
                hitung.inputNilaiBaru(banyakData);
                System.out.print("Daftar Nilai Baru : ");
                hitung.cetakNilaiBaru();
                break;
        }


    }
}