import java.util.ArrayList;
import java.util.Scanner;

public class testArrayList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<Integer>();

        System.out.print("Masukkan ukurannya: ");
        int size = scan.nextInt();

        System.out.println("\nMasukkan Datanya: ");
        for(int i=0; i<size; i++)
        {
            System.out.print("Data ke "+(i+1)+"=");
            data.add(scan.nextInt());
        }
        System.out.println("Mencetak Data Arraylist: ");
        for(int i=0; i<data.size();i++)
        {
            System.out.println("Data ke "+(i+1)+" adalah "+data.get(i));
        }
    }
}