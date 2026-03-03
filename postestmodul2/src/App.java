import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("======= SISTEM PAYROLL PERUSAHAAN =======");

        System.out.print("Nama Karyawan : ");
        String NamaKaryawan = input.nextLine();
        System.out.print("Gaji Pokok (Rp): ");
        double GajiPokok = input.nextDouble();
        System.out.print("Jumlah Jam Lembur : ");
        int JamLembur = input.nextInt();

        System.out.println("======== SLIP GAJI KARYAWAN ========");
        System.out.println("Nama Karyawan : " + NamaKaryawan);
        System.out.println("Upah lembur/jam : Rp " + (GajiPokok/173));
        System.out.println("Total Uang Lembur : Rp " + (JamLembur * (GajiPokok/173)));
        System.out.println("Total Gaji : Rp " + (GajiPokok + (JamLembur * (GajiPokok/173))));
        System.out.println("-----------------------------------");
        System.out.println("Potongan Pajak (5% dari gaji kotor) : Rp " + ((GajiPokok + (JamLembur * (GajiPokok/173))) * 0.05));
        System.out.println("Potongan BPJS Kesehatan (1% dari gaji kotor) : Rp " + (GajiPokok + (JamLembur * (GajiPokok/173))) * 0.01);

        System.out.println("GAJI BERSIH : Rp " + ((GajiPokok + (JamLembur * (GajiPokok/173))) - ((GajiPokok + (JamLembur * (GajiPokok/173))) * 0.05) - ((GajiPokok + (JamLembur * (GajiPokok/173))) * 0.01)));





    }
}
