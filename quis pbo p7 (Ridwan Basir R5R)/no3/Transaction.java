public class Transaction {
    private String poli;
    private String doctor;
    private String doctorNotes;
    private double registrationFee;
    private double medicineCost;
    private double vitaminCost;
    private double doctorCost;

    public Transaction(Patient patient, String poli, String doctor, String doctorNotes, double registrationFee, double medicineCost, double vitaminCost, double doctorCost) {
        this.poli = poli;
        this.doctor = doctor;
        this.doctorNotes = doctorNotes;
        this.registrationFee = registrationFee;
        this.medicineCost = medicineCost;
        this.vitaminCost = vitaminCost;
        this.doctorCost = doctorCost;
    }

    public double calculateTotalCost() {
        return registrationFee + medicineCost + vitaminCost + doctorCost;
    }

    public String generateReceipt() {
        return "Poli: " + poli + "\nDokter: " + doctor + "\nKeterangan: " + doctorNotes + "\nTotal biaya yang dibayar pasien Rp. " + calculateTotalCost();
    }

    public String getPoli() {
        return poli;
    }

    public String getDoctor() {
        return doctor;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public double getMedicineCost() {
        return medicineCost;
    }

    public double getVitaminCost() {
        return vitaminCost;
    }

    public String getDoctorNotes() {
        return doctorNotes;
    }

    public double getDoctorCost() {
        return doctorCost;
    }
}
