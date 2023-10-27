import java.util.Scanner;

public class Perawatan {
    private String jenisPerawatan;
    private double hargaPerawatan;

    public Perawatan() {
        // Constructor kosong
    }

    public void pilihJenisPerawatan(Scanner scanner) {
        System.out.println("\nPilihan Jenis Perawatan:");
        System.out.println("1. Fasial Wajah");
        System.out.println("2. Masker");
        System.out.println("3. Potong Rambut");
        System.out.println("\n---------------------o0o------------------------------");
        System.out.print("Pilihan Anda :");
        int pilihan = scanner.nextInt();
        System.out.println("---------------------o0o------------------------------");

        if (pilihan == 1) {
            jenisPerawatan = "Fasial Wajah";
            System.out.println("\n=== Menu Fasial Wajah ===");
            System.out.println("1. Fasial Biasa (Rp. 50.000)");
            System.out.println("2. Fasial Emas (Rp. 100.000)");
            System.out.println("\n---------------------o0o------------------------------");
            System.out.print("Masukan Pilihan Anda : ");
            int pilihanFasial = scanner.nextInt();
            System.out.println("---------------------o0o------------------------------");
            if (pilihanFasial == 1) {
                hargaPerawatan = 50000.0;
            } else if (pilihanFasial == 2) {
                hargaPerawatan = 100000.0;
            } else {
                System.out.println("Pilihan Fasial Wajah tidak valid.");
            }
        } else if (pilihan == 2) {
            jenisPerawatan = "Masker";
            System.out.println("\n=== Menu Masker ===");
            System.out.println("1. Masker Buah (Rp. 40.000)");
            System.out.println("2. Masker Lumpur (Rp. 75.000)");
            System.out.println("\n---------------------o0o------------------------------");
            System.out.print("Masukan Pilihan Anda :");
            int pilihanMasker = scanner.nextInt();
            System.out.println("---------------------o0o------------------------------");
            if (pilihanMasker == 1) {
                hargaPerawatan = 40000.0;
            } else if (pilihanMasker == 2) {
                hargaPerawatan = 75000.0;
            } else {
                System.out.println("Pilihan Masker tidak valid.");
            }
        } else if (pilihan == 3) {
            jenisPerawatan = "Potong Rambut";
            System.out.println("\n=== Menu Potong Rambut ===");
            System.out.println("1. Tidak Keramas (Rp. 20.000)");
            System.out.println("2. Keramas (Rp. 35.000)");
            System.out.println("\n---------------------o0o------------------------------");
            System.out.print("Masukan Pilihan Anda :");
            int pilihanPotongRambut = scanner.nextInt();
            System.out.println("---------------------o0o------------------------------");
        
            if (pilihanPotongRambut == 1) {
                hargaPerawatan = 20000.0;
            } else if (pilihanPotongRambut == 2) {
                hargaPerawatan = 35000.0;
            } else {
                System.out.println("Pilihan Potong Rambut tidak valid.");
            }
        } else {
            System.out.println("Pilihan Jenis Perawatan tidak valid.");
        }
    }

    public double hitungHargaTotalPerawatan() {
        return hargaPerawatan;
    }
}
