package latihan.tunjangan;
import java.util.Scanner;

public class Tunjangan {
	public static void main(String[] args) {
        System.out.println("============Program Tunjangan============");
        
        Scanner gajiReader = new Scanner(System.in);
        Scanner statusReader = new Scanner(System.in);
        
        System.out.print("Berapa gaji pokok Anda perbulan \t: Rp. ");
        double gajiPokok = gajiReader.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) \t: ");
        String status = statusReader.nextLine();
        double tunjangan,total;
        if(status.equals("Menikah")) 
        {
        	tunjangan = gajiPokok * 0.35;
        	total = gajiPokok + tunjangan;
        	System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        	System.out.printf("Gaji Pokok\t : %,12.2f%n", gajiPokok);
        	System.out.printf("Tunjangan\t : %,12.2f%n", tunjangan);
        	System.out.printf("Total Gaji\t : %,12.2f%n", total);
        	
        } else {
        	System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        	System.out.printf("Gaji Pokok\t : %,12.2f%n", gajiPokok);

        }
        System.out.println("(Developed by : Wildan Muhammad Fikri)");
        
        gajiReader.close();
        statusReader.close();
        	
        
        
    }
}
