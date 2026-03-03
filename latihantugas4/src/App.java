import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.print("masukkan waktu dalam detik = ");

    int detik = input.nextInt();
    int jam = detik / 3600;
    int menit = (detik % 3600) / 60;
    int sisaDetik = detik % 60;

    System.out.println("hasil konversi =  " + jam + " jam " + menit + " menit " + sisaDetik + " detik");
    input.close();
    }
}
