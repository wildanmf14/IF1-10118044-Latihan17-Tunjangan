package latihan.tunjangan;
import java.util.Scanner;

public class Tunjangan {
	public static void main(String[] args) {
        System.out.println("============Program Tunjangan============");
        
        Scanner gajiReader = new Scanner(System.in);
        Scanner statusReader = new Scanner(System.in);
        
        System.out.printf("Berapa gaji pokok Anda perbulan : Rp. ");
        double gajiPokok = gajiReader.nextDouble();
        System.out.printf("Status Anda? (Menikah/Belum) \t: ");
        String status = statusReader.nextLine();
        double tunjangan,total;
        if(status.equals("Menikah")) 
        {
        	tunjangan = gajiPokok * 0.35;
        	total = gajiPokok + tunjangan;
        	System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        	System.out.printf("Gaji Pokok\t : Rp. %,12.2f%n", gajiPokok);
        	System.out.printf("Tunjangan\t : Rp. %,12.2f%n", tunjangan);
        	System.out.printf("Total Gaji\t : Rp. %,12.2f%n", total);
        	
        } else {
        	System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        	System.out.printf("Gaji Pokok\t : %,12.2f%n", gajiPokok);

        }
        System.out.println("(Developed by : Wildan Muhammad Fikri)");
        
        gajiReader.close();
        statusReader.close();
        	
        
        
    }
}
