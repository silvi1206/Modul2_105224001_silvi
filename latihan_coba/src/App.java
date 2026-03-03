import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        String nama = "silvi";
        int sks = 2;
        double ipk = 4.0;
        boolean isLulus = true;

        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks + " dengan IPK: " + ipk);
        System.out.println("Apakah saya lulus " + isLulus);

        int a = 20, b = 10;
        int c = 10, d = 3;

        double hasil = c / d;
        System.out.println("Hasil perkalian 20 dan 10 =  " + (a * b));
        System.out.println("Hasil pembagian 10/3 =  " + (c / d));
        System.out.println("Hasil pembagian 10/3 =  " + ((double)c / d));
        System.out.println("Hasil pembagian 10/3 =  " + (hasil));
        System.out.println("Hasil modulus =  " + (c % d));
        System.out.println("Hasil penjumlahan 20 dan 10 =  " + (a + b));
        System.out.println("Hasil pengurangan 20 dan 10 =  " + (a - b));

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tanggal lahir Anda: ");
        int tanggalLahir = input.nextInt();

        input.nextLine(); 

        System.out.print("Masukkan nama lengkap Anda: ");
        String namaLengkap = input.nextLine();

        System.out.println(namaLengkap +" "  + tanggalLahir);
        input.close();


    }

}
