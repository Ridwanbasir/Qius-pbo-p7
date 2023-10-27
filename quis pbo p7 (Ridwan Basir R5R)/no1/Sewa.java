import java.util.Scanner;

public class Sewa {
    private String jenisSewa;
    private double hargaSewa;
    private int jumlahJamSewa;

    public Sewa() {
        // Constructor kosong
    }

    public void pilihJenisSewa(Scanner scanner) {
        System.out.println("\n=== Jenis Penyewaan ===");
        System.out.println("1. Rias Wajah   (Biasa/Mua)");
        System.out.println("2. Baju Pengantin  (Adat/Internasional)");
        System.out.println("3. Aksesoris   (Anak/Dewasa)");
        System.out.println("\n---------------------o0o------------------------------");
        System.out.print("Pilihan Anda :");
        int pilihan = scanner.nextInt();
        System.out.println("---------------------o0o------------------------------");

        if (pilihan == 1) {
            jenisSewa = "Rias Wajah";
            System.out.println("\n=== Menu Rias Wajah ===");
            System.out.println("1. Rias Wajah Biasa (Rp. 100.000)");
            System.out.println("2. Rias Wajah (Make Up Artis) (Rp. 250.000)");
            System.out.println("\n---------------------o0o------------------------------");
            System.out.print("Masukan Pilihan Anda :");
            int pilihanRiasWajah = scanner.nextInt();
            System.out.println("---------------------o0o------------------------------");
            if (pilihanRiasWajah == 1) {
                hargaSewa = 100000.0;
            } else if (pilihanRiasWajah == 2) {
                hargaSewa = 250000.0;
            } else {
                System.out.println("Pilihan Rias Wajah tidak valid.");
            }
        } else if (pilihan == 2) {
            jenisSewa = "Baju Pengantin";
            System.out.println("\n=== Menu Baju Pengantin ===");
            System.out.println("1. Baju Pengantin Adat (Rp. 150.000)");
            System.out.println("2. Baju Pengantin Internasional (Rp. 250.000)");
            System.out.println("\n---------------------o0o------------------------------");
            System.out.print("Masukan Pilihan Anda : ");
            int pilihanBajuPengantin = scanner.nextInt();
            System.out.println("---------------------o0o------------------------------");
            if (pilihanBajuPengantin == 1) {
                hargaSewa = 150000.0;
            } else if (pilihanBajuPengantin == 2) {
                hargaSewa = 250000.0;
            } else {
                System.out.println("Pilihan Baju Pengantin tidak valid.");
            }
        } else if (pilihan == 3) {
            jenisSewa = "Aksesoris";
            System.out.println("\n=== Menu Aksesoris ===");
            System.out.println("1. Aksesoris Anak (Rp. 20.000)");
            System.out.println("2. Aksesoris Dewasa (Rp. 50.000)");
            System.out.println("\n---------------------o0o------------------------------");
            System.out.print("Masukan Pilihan Anda :");
            int pilihanAksesoris = scanner.nextInt();
            System.out.println("---------------------o0o------------------------------");
            if (pilihanAksesoris == 1) {
                hargaSewa = 20000.0;
            } else if (pilihanAksesoris == 2) {
                hargaSewa = 50000.0;
            } else {
                System.out.println("Pilihan Aksesoris tidak valid.");
            }
        } else {
            System.out.println("Pilihan Jenis Sewa tidak valid.");
        }

        System.out.print("Berapa Jam : ");
        jumlahJamSewa = scanner.nextInt();
        System.out.println("Data Tersimpan ");
        System.out.print("Harga Sebesar: Rp. " + hargaSewa * jumlahJamSewa);
    }

    public double getHargaSewa() {
        return hargaSewa * jumlahJamSewa;
    }
}
