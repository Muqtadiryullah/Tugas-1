/* Nama : M. Muqtadiryullah Iskandar
   NIM : 13020220112
   Hari/Tgl : Minggu, 25 Februari 2024
   Jam : 00.05
 */
public class test16 {
    public static void main(String[] args) {
        boolean Bool1, Bool2, TF;
        int i,j, hsl ;
        float x,y,res;
        System.out.println("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
        Bool1 = true; Bool2 = false;
        //Boolean//
        System.out.print("Boolean : ");
        TF = Bool1 && Bool2 ; /* Boolean AND */
        System.out.print("\n"+TF);
        TF = Bool1 || Bool2 ; /* Boolean OR */
        System.out.print("\n"+TF);
        TF = ! Bool1 ; /* NOT */
        System.out.print("\n"+TF);
        TF = Bool1 ^Bool2; /* XOR */
        System.out.print("\n"+TF);
        System.out.print("\n");

        //Operasi Numerik//
        System.out.print("\nOperasi Numerik : ");
        i = 5; j = 2 ;
        hsl = i+j;
        System.out.print("\n"+hsl);
        hsl = i - j;
        System.out.print("\n"+hsl);
        hsl = i / j;
        System.out.print("\n"+hsl);
        hsl = i * j;
        System.out.print("\n"+hsl);
        hsl = i /j ; /* pembagian bulat */
        System.out.print("\n"+hsl);
        hsl = i%j ; /* sisa modulo */
        System.out.print("\n"+hsl);
        x = 5 ; y = 5 ;
        res = x + y;
        System.out.print("\n"+res);
        res = x - y;
        System.out.print("\n"+res);
        res = x / y;
        System.out.print("\n"+res);
        res = x * y;
        System.out.print("\n"+res);
        System.out.print("\n");

        //Operasi Relasional Numerik//
        System.out.print("\nOperasi Relasi Numerik : ");
        TF = (i==j);
        System.out.print("\n"+TF);
        TF = (i!=j);
        System.out.print("\n"+TF);
        TF = (i < j);
        System.out.print("\n"+TF);
        TF = (i > j);
        System.out.print("\n"+TF);
        TF = (i <= j);
        System.out.print("\n"+TF);
        TF = (i >= j);
        System.out.print("\n"+TF);
        TF = (x != y);
        System.out.print("\n"+TF);
        TF = (x < y);
        System.out.print("\n"+TF);
        TF = (x > y);
        System.out.print("\n"+TF);
        TF = (x <= y);
        System.out.print("\n"+TF);
        TF = (x >= y);
        System.out.print("\n"+TF);
    }
}
