package Evaluasi.HitungNIlai;

/**
 *
 * @author Sony
 */
public class HitungNilaiAkhir {
    public double nilaiTugas(int tugas1, int tugas2){
        double tugas;
        tugas = (tugas1+tugas2)/2;
        return tugas;
    }
    public double nilaiAkhir(double tugas, int mid, int uas){
        double total;
        total = (tugas*0.4)+(mid*0.3)+(uas*0.3);
        return total;
    }
}
