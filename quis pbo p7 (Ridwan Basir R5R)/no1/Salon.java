import java.util.Scanner;

public class Salon {
    private String nama;
    private String noTelepon;
    private double totalBiaya;

    public Salon(String nama, String noTelepon) {
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.totalBiaya = 0;
    }

    public void layananPerawatan(Perawatan perawatan, Scanner scanner) {
        perawatan.pilihJenisPerawatan(scanner);
        totalBiaya += perawatan.hitungHargaTotalPerawatan();
    }

    public void layananSewa(Sewa sewa, Scanner scanner) {
        sewa.pilihJenisSewa(scanner);
        totalBiaya += sewa.getHargaSewa();
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void sapaPelanggan() {
        System.out.println("Terima kasih" + nama + "Sudah datang di Salon Cantika membuat Anda cantik adalah keahlian kami");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n---------- Selamat Datang di Salon Cantika ----------");
        System.out.println("=====================================================");
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan nomor telepon pelanggan: ");
        String noTelepon = scanner.nextLine();

        Salon salon = new Salon(namaPelanggan, noTelepon);
        System.out.println("\n---------------------o0o------------------------------");
        System.out.print("Lakukan Transaksi? [y/t]? ");
        char transaksi = scanner.next().charAt(0);
        System.out.println("---------------------o0o------------------------------");
        

        if (transaksi != 'y') {
            System.out.println("Terima Kasih "+ namaPelanggan +""+"Sudah datang di Salon Cantika membuat Anda cantik adalah keahlian kami" );
            
            System.exit(0);
        }
        char lanjut = 'y';
        while (lanjut == 'y') {
            System.out.println("\nMenu Pilihan Yang Tersedia:");
            System.out.println("1. Perawatan");
            System.out.println("2. Penyewaan");
            System.out.println("\n---------------------o0o------------------------------");
            System.out.print("Pilihan menu : ");
            char pilihanMenu = scanner.next().charAt(0);
            System.out.println("---------------------o0o------------------------------");

            if (pilihanMenu == '1') {
                Perawatan perawatan = new Perawatan();
                salon.layananPerawatan(perawatan, scanner);
            } else if (pilihanMenu == '2') {
                Sewa sewa = new Sewa();
                salon.layananSewa(sewa, scanner);
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
            }
            System.out.println("\n---------------------o0o------------------------------");
            System.out.print("Apakah ingin input lagi (y/t)? ");
            lanjut = scanner.next().charAt(0);
            System.out.println("---------------------o0o------------------------------");
        }

        System.out.println("Total biaya yang harus dibayar: " + salon.getTotalBiaya());
        salon.sapaPelanggan();
    }
}
