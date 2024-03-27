public class testArray {
    public static void main(String[] args){

        int nilai [] = new int[5];
        String nama [] = new String[5];
        nilai[0] = 10;
        nilai[4] = 15;
        nilai[2] = 200;
        nama[1] = "Mamat";
        nama[0] = "Badrol";
        nama[3] = "Becky";
        System.out.println("Isi dari nilai[0] adalah: "+nilai[0]);
        int jumlah = nilai[4] + nilai[2];
        System.out.println("Jumlahnya adalah: "+jumlah);
        System.out.println("Nama pertama adalah: "+nama[0]);
        System.out.println("Nama keempat adalah: "+nama[3]);
        System.out.println("Nama kedua adalah: "+nama[1]);
    }

}