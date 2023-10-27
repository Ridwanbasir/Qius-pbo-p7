import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Selamat datang di rumah sakit Waras ----------");
        System.out.println("==================================================");
        System.out.println("------------------o0o-----------------------------");
        System.out.println("Masukkan data pasien");
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();
        System.out.print("Alamat: ");
        String address = scanner.nextLine();
        System.out.print("Masukkan No. tlp: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("\n*Nama poli*");
        System.out.println("1. Gigi");
        System.out.println("2. Anak");
        System.out.println("3. Umum");

        System.out.print("\nPilih poli: ");
        int selectedPoli = scanner.nextInt();

        String poliName = getSelectedPoliName(selectedPoli);

        System.out.println("\n*Nama dokter*");
        System.out.println("1. drg. Ahmad Afandi");
        System.out.println("2. dr. Aris Wicaksono, Sp.A");
        System.out.println("3. dr. Alfia Putri");

        System.out.print("\nPilih dokter : ");
        int selectedDoctor = scanner.nextInt();

        String doctorName = getSelectedDoctorName(selectedDoctor);

        scanner.nextLine();

        System.out.print("\nBerikan keterangan dokter: ");
        String doctorNotes = scanner.nextLine();

        System.out.print("\nMasukkan biaya pendaftaran Rp. ");
        double registrationFee = scanner.nextDouble();
        System.out.print("Masukkan biaya Obat Rp. ");
        double medicineCost = scanner.nextDouble();
        System.out.print("Masukkan biaya vitamin Rp. ");
        double vitaminCost = scanner.nextDouble();
        System.out.print("Masukkan biaya Dokter Rp. ");
        double doctorCost = scanner.nextDouble();

        Patient patient = new Patient(name, address, phoneNumber);
        Transaction transaction = new Transaction(patient, poliName, doctorName, doctorNotes, registrationFee,
                medicineCost, vitaminCost, doctorCost);

        System.out.println("------------------o0o----------------------------");
        System.out.println("==================================================");

        System.out.println("\nPoli                           " + transaction.getPoli());
        System.out.println("Dokter                         " + transaction.getDoctor());
        System.out.println("Keterangan Dokter              " + transaction.getDoctorNotes());
        System.out.println("\nTotal Biaya yang di bayar pasien Rp. " + transaction.calculateTotalCost());
        System.out.println("Salam sehat " + patient.getName() + " dari rumah sakit Waras");
        System.out.println("\n==================================================");

        scanner.close();
    }

    private static String getSelectedPoliName(int selectedPoli) {
        switch (selectedPoli) {
            case 1:
                return "Gigi";
            case 2:
                return "Anak";
            case 3:
                return "Umum";
            default:
                return "Poli tidak valid";
        }
    }

    private static String getSelectedDoctorName(int selectedDoctor) {
        switch (selectedDoctor) {
            case 1:
                return "drg. Ahmad Afandi";
            case 2:
                return "dr. Aris Wicaksono, Sp.A";
            case 3:
                return "dr. Alfia Putri";
            default:
                return "Dokter tidak valid";
        }
    }
}
